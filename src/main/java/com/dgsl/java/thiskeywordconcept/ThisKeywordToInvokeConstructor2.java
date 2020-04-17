/*Calling parameterized Constructor from default parameterized constructor.*/

package com.dgsl.java.thiskeywordconcept;

public class ThisKeywordToInvokeConstructor2 {

	ThisKeywordToInvokeConstructor2() {
		this(30);
		System.out.println("This is defaultConstructor");
	}

	ThisKeywordToInvokeConstructor2(int parameterAge) {
		System.out.println("This is parameterizedConstructor: " + parameterAge);
	}

	public static void main(String[] args) {
		ThisKeywordToInvokeConstructor2 obj = new ThisKeywordToInvokeConstructor2();
	}

}
