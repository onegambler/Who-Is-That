package com.whoisthat.system.question;

import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

public class SolutionQuestion implements Question {

	private String name;

	public SolutionQuestion(String name) {
		requireNonNull(name, "Name for the solution has not been specified, found null");
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
