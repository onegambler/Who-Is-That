package com.whoisthat.system.question;

import com.whoisthat.GameTerminal;
import lombok.Data;

import java.text.MessageFormat;
import java.util.ResourceBundle;

@Data
public class WearQuestion implements Question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4659996970827833406L;
	private GameTerminal pron;
	private GameTerminal accessory;

	public WearQuestion(GameTerminal pron, GameTerminal accessory) {
		this.pron = pron;
		this.accessory = accessory;
	}

	public GameTerminal getAccessory() {
		return accessory;
	}
}
