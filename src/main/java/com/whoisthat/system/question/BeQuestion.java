package com.whoisthat.system.question;

import lombok.Data;

import java.text.MessageFormat;
import java.util.ResourceBundle;

@Data
public class BeQuestion implements Question {

	private String pron;
	private String trait;

	public BeQuestion(String pron, String attribute) {
		this.pron = pron;
		this.trait = attribute;
	}

	@Override
	public String toString(ResourceBundle messages) {
		String output;
		MessageFormat formatter;
		formatter = new MessageFormat("");
		formatter.setLocale(messages.getLocale());
		formatter.applyPattern(messages.getString("be"));

		output = formatter
				.format(new Object[] {
						messages.getString(pron),
						messages.getString(trait
								+ messages.getString(pron + "suffix")) });

		return output;
	}
}
