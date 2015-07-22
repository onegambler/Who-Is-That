package com.whoisthat.system.question;

import java.io.Serializable;
import java.util.ResourceBundle;

import static java.util.Objects.requireNonNull;

public interface Question extends Serializable {

	String toString(ResourceBundle resource);

	static QuestionBuilder builder() {
		return new QuestionBuilder();
	}

	class QuestionBuilder {

		private QuestionType type;
		private String pronoun;
		private String accessory;
		private String pysicalTrait;
        private String look;

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

		public QuestionBuilder withPronoun(String pronoun) {
			this.pronoun = pronoun;
			return this;
		}

		public QuestionBuilder withPhysicalTrait(String trait) {
			this.pysicalTrait = trait;
			return this;
		}

		public QuestionBuilder withLook(String look) {
			this.look = look;
			return this;
		}

		public QuestionBuilder withAccessory(String accessory) {
			this.accessory = accessory;
			return this;
		}

		public Question create() {
			requireNonNull(type, "Question type cannot be null");
			requireNonNull(pronoun, "Pronoun cannot be null");

            switch (type) {
                case HAVE:
                    requireNonNull(pysicalTrait, "Physical trait cannot be null in a Have Question");
                    requireNonNull(look, "Trait look cannot be null in a Have Question");
                    return new HaveQuestion(pronoun, pysicalTrait, look);
                case BE:
                    requireNonNull(look, "Trait look cannot be null in a Be Question");
                    return new BeQuestion(pronoun, look);
                case WEAR:
                    requireNonNull(accessory, "Accessory cannot be null for a Wear Question");
                    return new WearQuestion(pronoun, accessory);

            }

            throw new IllegalStateException("Question type not allowed");
		}

		private enum QuestionType {
			HAVE, BE, WEAR, ANSWER
		}

	}
}