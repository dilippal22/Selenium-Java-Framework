/*Write a Java Program to Trim Whitespace From String Without Using Trim Method : " datamatics global services "*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class TrimSpacesFromStringMethod2 {

	public static String trimSpace(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str = str.substring(i, str.length());
				break;
			}

		}

		for (int j = str.length() - 1; j > 0; j--) {
			if (str.charAt(j) != ' ') {
				str = str.substring(0, j + 1);
				break;
			}
		}

		return str;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to remove spaces from");
		String userInput = sc.nextLine();

		System.out.println("User Input String befor Trim: \"" + userInput
				+ "\"");

		System.out.println("String after Trim: \"" + trimSpace(userInput)
				+ "\"");

		sc.close();
	}
}
