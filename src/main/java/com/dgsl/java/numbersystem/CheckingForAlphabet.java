/*Write a program to check if given character is Alphabet or not.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class CheckingForAlphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the character you to want to check for Alphabet");
		char c = sc.next().charAt(0);
		
		//Checking for an Alphabet using Ternary operator
		String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? c
				+ " is an Alphabet" : c + " is not an Alphabet";

		System.out.println(output);
		
		sc.close();
	}
}
