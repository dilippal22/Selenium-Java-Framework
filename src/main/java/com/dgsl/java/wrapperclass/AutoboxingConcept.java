/*Wrapper class is class whose object wraps or contains value of primitive data type.
When object of wrapper class is created, it contains a field and that field stores the value of primitive data type.
Autoboxing : Automatic conversion of primitive data type into object of their corresponding class.
Write a program showing example of Autoboxing.*/

package com.dgsl.java.wrapperclass;

public class AutoboxingConcept {

	public static void main(String[] args) {

		char ch = 's';

		// Autoboxing - converting from primitive data type to the object of
		// wrapper class - Example 1
		Character obj = ch;
		System.out.println("Output after autoboxing - Example 1: " + obj);

		// Autoboxing - Example 2
		int a = 50;

		// Converted primitive data type into corresponding wrapper class
		Integer b = new Integer(a);
		System.out.println("Output after autoboxing - Example 2: " + b);

	}

}
