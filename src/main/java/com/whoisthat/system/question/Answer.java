package com.whoisthat.system.question;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Answer implements Comparable<Answer> {

	private final String methodToInvoke;
	private final String value;
	private final String attribute;

	private static final String PRON = "he";

	public Answer(String methodToInvoke, String value,
				  String attribute) {
		this.methodToInvoke = methodToInvoke;
		this.value = value;
		this.attribute = attribute;
	}

    @Override
    public int compareTo(@NonNull Answer singleTrait) {
        if (this.getMethodToInvoke().equals(singleTrait.getMethodToInvoke())
                && this.value.equals(singleTrait.getValue()))
            return 0;
        else
            return this.getMethodToInvoke().compareTo(singleTrait.getMethodToInvoke());
    }
}
