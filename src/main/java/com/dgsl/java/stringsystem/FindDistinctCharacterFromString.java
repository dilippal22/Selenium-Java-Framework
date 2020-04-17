/*Write a Java Program to Find Distinct Characters In Given String : Datamatics Global Services*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class FindDistinctCharacterFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to find distinct from");
		String userInput = sc.nextLine();

		sc.close();

		// Convert the userInput to lower case
		userInput = userInput.toLowerCase();

		// Replace all the white spaces with empty space
		userInput = userInput.replace(" ", "");

		while (userInput.length() > 0) {

			char charIndex = userInput.charAt(0);

			if (userInput.lastIndexOf(charIndex) == 0) {
				System.out.print(charIndex + " ");
			}

			userInput = userInput.replace(Character.toString(charIndex), "");

		}

	}
}
