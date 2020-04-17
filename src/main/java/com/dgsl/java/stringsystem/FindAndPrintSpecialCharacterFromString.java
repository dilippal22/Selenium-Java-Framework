/*Write a Java program to find and print all special characters with their positions in a
 * user input string : Make%Sele/nium$Easy#*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndPrintSpecialCharacterFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with special character");
		String userInput = sc.nextLine();

		Pattern p = Pattern.compile("[ !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");

		Matcher m = p.matcher(userInput);

		int countOfSplChars = 0;

		while (m.find()) {
			countOfSplChars += 1;

			System.out.println(userInput.charAt(m.start()) + " at position: "
					+ (m.start() + 1));
		}
		System.out.println("Total special characters found are: "
				+ countOfSplChars);

		sc.close();

	}
}
