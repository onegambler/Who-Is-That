package com.whoisthat.system.question;

import com.whoisthat.GameTerminal;
import lombok.Data;
import lombok.ToString;

@Data
public class HaveQuestion implements Question {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3453334361321216959L;
	private GameTerminal pron;
	private GameTerminal trait;
	private GameTerminal look;

	public HaveQuestion(GameTerminal pron, GameTerminal attribute, GameTerminal look) {

		this.pron = pron;
		this.trait = attribute;
		this.look = look;
	}

	public HaveQuestion(GameTerminal pron, GameTerminal attribute) {
		this(pron, attribute, null);
	}

	public GameTerminal getTrait() {
		return trait;
	}

	public GameTerminal getLook() {
		return look;
	}
}
