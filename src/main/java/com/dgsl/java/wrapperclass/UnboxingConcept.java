/*It is reverse of Autoboxing.
Unboxing: Automatic conversion of object of wrapper class to its corresponding primitive data type.
Write a program showing example of Unboxing.*/

package com.dgsl.java.wrapperclass;

import java.util.ArrayList;

public class UnboxingConcept {

	public static void main(String[] args) {

		Character obj = 'd';

		// Unboxing - Converting Character object to primitive data type
		char d = 'g';

		// unboxing Example
		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add('e');

		// Unboxing because get method returns an Integer object
		char num = arrayList.get(0);

		System.out.println(num);
	}

}
