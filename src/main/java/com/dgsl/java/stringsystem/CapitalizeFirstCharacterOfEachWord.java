/*Write a Java Program to Capitalize First Character of Each Word in a String Sentence : Datamatics Global Services*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class CapitalizeFirstCharacterOfEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String that you want to make upper case");
		String userInput = sc.nextLine();

		String lowerCaseInput = userInput.toLowerCase();

		String[] wordArray = lowerCaseInput.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < wordArray.length; i++) {
			sb.append(Character.toUpperCase(wordArray[i].charAt(0)))
					.append(wordArray[i].substring(1)).append(" ");

		}

		System.out.println(sb);

		sc.close();
	}

}
