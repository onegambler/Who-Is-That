package com.whoisthat.system.question;

import com.whoisthat.GameTerminal;
import lombok.Data;

import java.text.MessageFormat;
import java.util.ResourceBundle;

@Data
public class BeQuestion implements Question {

	private GameTerminal pron;
	private GameTerminal trait;

	public BeQuestion(GameTerminal pron, GameTerminal attribute) {
		this.pron = pron;
		this.trait = attribute;
	}
}
