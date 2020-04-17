package com.dgsl.java.thiskeywordconcept;

public class ThisKeywordToInvokeMethod {

	void instanceMethod() {
		System.out.println("This is instanceMethod");
	}

	void anotherInstanceMethod() {
		this.instanceMethod();
		System.out.println("This is anotherInstanceMethod");
		// instanceMethod();

	}

	public static void main(String[] args) {
		ThisKeywordToInvokeMethod obj = new ThisKeywordToInvokeMethod();
		obj.anotherInstanceMethod();
	}

}
