/*Write a Java Program to Extract Numbers From String and Add : #GeeKs12fOr@gEEks08*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ExtractNumberFromStringAndAddMethod1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want extract number from");
		String input = sc.nextLine();

		int inputSize = input.length();

		int number = 0;
		int result = 0;

		for (int i = 0; i < inputSize; i++) {

			char eachChar = input.charAt(i);

			if (Character.isDigit(eachChar)) {
				number = Character.getNumericValue(eachChar);
				result = result + number;
			}
		}

		System.out.println("Addition of Digit is : " + result);

		sc.close();
	}

}
