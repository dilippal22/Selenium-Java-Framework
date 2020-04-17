/*Write a Java Program to Find Occurrence of Any Char in a Given String Without Iterating :  Datamatics Global Services Limited*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class FindCharFromStringWithoutIterating {

	public static int countOfCharOccurances(String inputString, char charToFind) {

		inputString = inputString.toLowerCase();

		int inputStringLength = inputString.length();

		String toCharString = Character.toString(charToFind).toLowerCase();

		inputString = inputString.replace(toCharString, "");

		int afterReplaceLength = inputString.length();

		int diffLength = inputStringLength - afterReplaceLength;

		return diffLength;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the String that you want to find occurance from");
		String userInput = sc.nextLine();

		System.out.println("Enter the Character you want to check");
		char charToFind = sc.next().charAt(0);

		System.out.println("Repeated Character occurances count is: "
				+ countOfCharOccurances(userInput, charToFind));

		sc.close();
	}

}
