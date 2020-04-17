package com.dgsl.java.superkeywordconcept;

class baseClass {

	baseClass() {
		System.out.println("This is baseClass constructor");
	}
}

class childOfBaseClass extends baseClass {
	childOfBaseClass() {
		super();
		System.out.println("This is childOfBaseClass constructor");
	}
}

public class SuperKeywordForParentClassConstructor {

	public static void main(String[] args) {
		new childOfBaseClass();
	}
}
