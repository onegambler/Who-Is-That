package com.whoisthat.system.question;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class WearQuestion implements Question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4659996970827833406L;
	private String pron;
	private String accessory;

	public WearQuestion(String pron, String accessory) {
		this.pron = pron;
		this.accessory = accessory;
	}

	public String getAccessory() {
		return accessory;
	}

	@Override
	public String toString(ResourceBundle messages) {
		String output;
		MessageFormat formatter;
		formatter = new MessageFormat("");
		formatter.setLocale(messages.getLocale());
		formatter.applyPattern(messages.getString("wear"));

		output = formatter.format(new Object[] { pron,
				messages.getString(accessory) });

		return output;
	}
}
