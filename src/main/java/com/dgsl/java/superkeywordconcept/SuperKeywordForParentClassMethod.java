package com.dgsl.java.superkeywordconcept;

class superClass {
	void superClassMethod() {
		System.out.println("This is super class - super method");
	}
}

class childOfSuperClass extends superClass {
	void childClassMethod() {
		System.out.println("This is child class - child method");
	}

	void childClassSecondMethod() {
		System.out.println("This is child class - second method");
	}

	void anotherChildClassMethod() {
		super.superClassMethod();
		childClassMethod();
	}
}

public class SuperKeywordForParentClassMethod {
	public static void main(String[] args) {
		childOfSuperClass obj = new childOfSuperClass();
		obj.anotherChildClassMethod();
	}

}
