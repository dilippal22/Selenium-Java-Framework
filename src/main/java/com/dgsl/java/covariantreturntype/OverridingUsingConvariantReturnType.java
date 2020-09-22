package com.dgsl.java.covariantreturntype;

class AnotherClass {

	AnotherClass method() {
		return this;
	}
}

public class OverridingUsingConvariantReturnType extends AnotherClass {
	OverridingUsingConvariantReturnType method() {
		return this;
	}

	public void printMessage() {
		System.out.println("Welcome to Covariant Return Type");
	}

	public static void main(String[] args) {
		new OverridingUsingConvariantReturnType().method().printMessage();
	}

}
