package com.dgsl.java.inheritance;

public class ChildClass extends ParentClass {

	public void childClassMethod() {
		System.out.println("Child Class Method Output");
	}

	public static void main(String[] args) {

		// Parent class reference variable can refer to parent class object
		ParentClass parentobject = new ParentClass();
		parentobject.parentClassMethod();

		// Child class reference variable can refer to child class object
		ChildClass childobject = new ChildClass();
		childobject.childClassMethod();

		// Child class reference variable can refer to parent class object
		ParentClass anotherparentobject = new ChildClass();
		anotherparentobject.parentClassMethod();

		// Child class reference variable can not refer to parent class object.
		ChildClass anotherchildobject = new ParentClass();
		anotherchildobject.childClassMethod();

	}

}
