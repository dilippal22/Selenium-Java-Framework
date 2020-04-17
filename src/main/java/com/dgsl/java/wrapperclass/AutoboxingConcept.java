/*Wrapper class is class whose object wraps or contains value of primitive data type.
When object of wrapper class is created, it contains a field and that field stores the value of primitive data type.
Autoboxing : Automatic conversion of primitive data type into object of their corresponding class.
Write a program showing example of Autoboxing.*/

package com.dgsl.java.wrapperclass;

import java.util.ArrayList;

public class AutoboxingConcept {

	public static void main(String[] args) {

		char ch = 's';

		// Autoboxing - converting from primitive data type to the object of
		// wrapper class
		Character obj = ch;

		// Autoboxing Example
		ArrayList<Character> arrayList = new ArrayList<Character>();

		// Autoxing because ArrayList and vector stores only objects
		arrayList.add('g');

		// Printing values from object
		System.out.println(arrayList.get(0));

	}

}
