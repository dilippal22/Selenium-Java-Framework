/*Calling default Constructor from parameterized constructor.*/

package com.dgsl.java.thiskeywordconcept;

public class ThisKeywordToInvokeConstructor1 {

	ThisKeywordToInvokeConstructor1() {
		System.out.println("This is defaultConstructor");
	}

	ThisKeywordToInvokeConstructor1(int parameterAge) {
		this();
		System.out.println("This is parameterizedConstructor: " + parameterAge);
	}

	public static void main(String[] args) {
		ThisKeywordToInvokeConstructor1 obj = new ThisKeywordToInvokeConstructor1(
				30);
	}

}
