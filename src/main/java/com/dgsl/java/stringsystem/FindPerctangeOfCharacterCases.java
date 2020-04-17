/*Write a program to print the % of upper case, lower case, and special character in a given sentence:#GeeKs01fOr@gEEks07*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class FindPerctangeOfCharacterCases {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that you want to check for");
		String input = sc.nextLine();

		// Getting total number of characters in the given sentence
		int inputSize = input.length();

		// Initializing upperCase, lowerCase, digit and others with 0
		double upperCase = 0;
		double lowerCase = 0;
		double digit = 0;
		double others = 0;

		// Iterating through each character of sentence
		for (int i = 0; i < inputSize; i++) {

			char eachChar = input.charAt(i);

			if (Character.isUpperCase(eachChar)) {
				upperCase++;

			} else if (Character.isLowerCase(eachChar)) {
				lowerCase++;

			} else if (Character.isDigit(eachChar)) {
				digit++;

			} else {
				others++;

			}
		}

		// Printing percentage of Upper Case, Lower Case, Digits and Others
		// count
		System.out.println("Upper Case letters are :"
				+ ((upperCase / inputSize) * 100) + "% ");

		System.out.println("Lower Case letters are :"
				+ ((lowerCase * 100) / inputSize) + "% ");

		System.out.println("Digits letters are :" + ((digit * 100) / inputSize)
				+ "% ");

		System.out.println("Others Case letters are :"
				+ ((others * 100) / inputSize) + "% ");

		sc.close();
	}
}
