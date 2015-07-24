package com.whoisthat.system.question;

import com.whoisthat.GameTerminal;

import java.io.Serializable;
import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

public interface Question extends Serializable {

	static QuestionBuilder builder() {
		return new QuestionBuilder();
	}

	class QuestionBuilder {

		private QuestionType type;
		private GameTerminal pronoun;
		private GameTerminal accessory;
		private GameTerminal physicalTrait;
        private GameTerminal look;

		private String solution;

		public QuestionBuilder be() {
			type = QuestionType.BE;
			return this;
		}

		public QuestionBuilder have() {
			type = QuestionType.HAVE;
			return this;
		}

		public QuestionBuilder wear() {
			type = QuestionType.WEAR;
			return this;
		}

		public QuestionBuilder answer() {
			type = QuestionType.ANSWER;
			return this;
		}

		public QuestionBuilder withPronoun(GameTerminal pronoun) {
			this.pronoun = pronoun;
			return this;
		}

		public QuestionBuilder withPhysicalTrait(GameTerminal trait) {
			this.physicalTrait = trait;
			return this;
		}

		public QuestionBuilder withLook(GameTerminal look) {
			this.look = look;
			return this;
		}

		public QuestionBuilder withAccessory(GameTerminal accessory) {
			this.accessory = accessory;
			return this;
		}

		public QuestionBuilder withSolution(String solution) {
			this.solution = solution;
			return this;
		}

		public Question create() {
			requireNonNull(type, "Question type cannot be null");

            switch (type) {
                case HAVE:
                    requireNonNull(pronoun, "Pronoun cannot be null");
                    requireNonNull(physicalTrait, "Physical trait cannot be null in a Have Question");
                    return new HaveQuestion(pronoun, physicalTrait, look);
                case BE:
                    requireNonNull(pronoun, "Pronoun cannot be null");
                    requireNonNull(look, "Trait look cannot be null in a Be Question");
                    return new BeQuestion(pronoun, look);
                case WEAR:
                    requireNonNull(pronoun, "Pronoun cannot be null");
                    requireNonNull(accessory, "Accessory cannot be null for a Wear Question");
                    return new WearQuestion(pronoun, accessory);
                case ANSWER:
                    requireNonNull(solution, "Solution cannot be null in an Answer Question");
                    return new SolutionQuestion(solution);

            }

            throw new IllegalStateException("Question type not allowed " + type);
		}

		private enum QuestionType {
			HAVE, BE, WEAR, ANSWER
		}

	}
}