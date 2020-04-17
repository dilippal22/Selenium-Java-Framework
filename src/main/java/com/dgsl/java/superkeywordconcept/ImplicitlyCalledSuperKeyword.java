package com.dgsl.java.superkeywordconcept;

class mainClass {
	mainClass() {
		System.out.println("This is mainClass - constructor");
	}
}

class childOfMainClass extends mainClass {
	childOfMainClass() {
		// By default super() keyword was called here
		// super();

		System.out.println("This is childOfMainClass - constructor");
	}
}

public class ImplicitlyCalledSuperKeyword {

	public static void main(String[] args) {
		new childOfMainClass();
	}

}
