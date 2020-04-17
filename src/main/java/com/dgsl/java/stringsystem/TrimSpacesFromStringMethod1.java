/*Write a Java Program to Trim Whitespace From String Without Using Trim Method : " datamatics global services "*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class TrimSpacesFromStringMethod1 {

	public static String trimSpace(String str) {

		// Finding length of string and storing in a variable
		int stringLength = str.length();

		// Assume 0th index is non space character
		int startNonSpaceIndex = 0;

		// Assume last index is non space character
		int lastNonSpaceIndex = stringLength - 1;

		// Converting input string into char array
		char[] arrayInput = str.toCharArray();

		// Increment startNonSpaceIndex by one until we really find a non space
		// char
		while (startNonSpaceIndex < stringLength
				&& arrayInput[startNonSpaceIndex] == ' ') {
			startNonSpaceIndex++;
		}

		// Decrement lastNonSpaceIndex by one until we really find a non space
		// char
		while (lastNonSpaceIndex < stringLength
				&& arrayInput[lastNonSpaceIndex] == ' ') {
			lastNonSpaceIndex--;
		}

		return str.substring(startNonSpaceIndex, lastNonSpaceIndex + 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to remove spaces from");
		String userInput = sc.nextLine();

		System.out.println("String before Trim: \"" + userInput + "\"");

		System.out.println("String after Trim: \"" + trimSpace(userInput)
				+ "\"");

		sc.close();
	}

}
