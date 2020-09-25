package com.dgsl.java.covariantreturntype;

class AnotherClass {

	AnotherClass method() {
		System.out.println("Parent Class method");
		return this;
	}
}

public class OverridingUsingConvariantReturnType extends AnotherClass {
	OverridingUsingConvariantReturnType method() {
		System.out.println("Child Class method");
		return this;
	}

	public void printMessage() {
		System.out.println("Welcome to Covariant Return Type");
	}

	public static void main(String[] args) {
		new OverridingUsingConvariantReturnType().method();
	}

}
