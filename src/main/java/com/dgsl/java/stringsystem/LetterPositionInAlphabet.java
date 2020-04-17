/*Write a program to find Position Of Letter in Alphabet.
 * Subtract 96 from the ASCII value for Lower Case Alphabet
 * Subtract 64 from the ASCII value for Lower Case Alphabet */

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class LetterPositionInAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the letter you want to find position in Alphabet");
		char letter = sc.next().charAt(0);

		int asciiValue = Character.toLowerCase(letter);

		asciiValue = asciiValue - 96;

		System.out.println(asciiValue);

		sc.close();
	}

}
