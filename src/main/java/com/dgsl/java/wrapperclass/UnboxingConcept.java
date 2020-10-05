/*It is reverse of Autoboxing.
Unboxing: Automatic conversion of object of wrapper class to its corresponding primitive data type.
Write a program showing example of Unboxing.*/

package com.dgsl.java.wrapperclass;

public class UnboxingConcept {

	public static void main(String[] args) {

		Character obj = 'd';

		// Unboxing - Converting Character object to primitive data type - Example 1
		char d = obj;
		System.out.println("Output after unboxing - Example 1: " + d);

		// Unboxing - Example 2
		Integer i = new Integer(50);

		// Converted wrapper class into corresponding primitive data type
		int b = i;
		System.out.println("Output after unboxing - Example 2: " + b);

	}

}
