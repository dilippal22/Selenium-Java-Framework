/*Write a program to reverse each character of a word of a sentence : my name is dilip*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ReverseEachCharacterOfSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that you want to reverse");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		String wReverse = "";

		for (int i = 0; i < word.length; i++) {

			String eachWord = word[i];

			for (int j = eachWord.length() - 1; j >= 0; j--) {
				wReverse = wReverse + eachWord.charAt(j);
			}
			wReverse = wReverse + " ";
		}
		System.out.println(wReverse);

		sc.close();
	}

}
