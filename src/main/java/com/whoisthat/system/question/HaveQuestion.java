package com.whoisthat.system.question;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class HaveQuestion implements Question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3453334361321216959L;
	private String pron;
	private String trait;
	private String look;

	public HaveQuestion(String pron, String attribute, String look) {

		this.pron = pron;
		this.trait = attribute;
		this.look = look;
	}

	public HaveQuestion(String pron, String attribute) {
		this(pron, attribute, "");
	}

	public String getTrait() {
		return trait;
	}

	public String getLook() {
		return look;
	}

	@Override
	public String toString(ResourceBundle messages) {

		String output;
		MessageFormat formatter;
		formatter = new MessageFormat("");
		formatter.setLocale(messages.getLocale());

		if (look.equals("")) {
			formatter.applyPattern(messages.getString("have1"));
			output = formatter.format(new Object[] { messages.getString(pron),
					messages.getString(trait) });
		} else {

			String temp = look + messages.getString(trait + "type");
			formatter.applyPattern(messages.getString("have2"));
			output = formatter.format(new Object[] { messages.getString(pron),
					messages.getString(temp), messages.getString(trait) });
		}
		return output;
	}
}
