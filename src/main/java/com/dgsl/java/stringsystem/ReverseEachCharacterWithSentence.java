/*Write a program to reverse each character with sentence : my name is dilip*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ReverseEachCharacterWithSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the sentence that you want to reverse with each character");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		String wReverse = "";

		// Reverse the sentence
		for (int i = word.length - 1; i >= 0; i--) {

			String eachWord = word[i];

			// Reverse the word
			for (int j = eachWord.length() - 1; j >= 0; j--) {
				wReverse = wReverse + eachWord.charAt(j);
			}
			wReverse = wReverse + " ";
		}

		// Printing the reversed sentence with reversed word
		System.out.println(wReverse);

		sc.close();
	}

}
