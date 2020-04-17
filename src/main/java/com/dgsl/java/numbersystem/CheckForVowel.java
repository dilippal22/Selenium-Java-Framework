//Program to find vowel from a given string

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class CheckForVowel {

	//Using switch case
	/*public static void main(String[] args) {
		char ch = 'z';

		switch (ch) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':

			System.out.println(ch + " is vowel");

		default:
			System.out.println(ch + " is consonant");

		}

	}*/
	
	
	
	
	//using if..else condition
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character you want to check");
		
		//used to check first character of the input string
		//char input = sc.findInLine(".").charAt(0);
		
		//used to check first character of the input character
		char input = sc.next().charAt(0);
		
		//used to check first character of the input character
		//char input = sc.next(".").charAt(0);
		
		//used to check first character of the input string and trim to remove any whitespaces
		//char input = sc.next().trim().charAt(0);
		
		if (input == 'a' || input == 'i' || input == 'o' || input == 'e'
				|| input == 'u') {
			System.out.println(input + " is vowel");
		} else {
			System.out.println(input + " is consonant");
		}
		
		sc.close();
	}*/
	
	
	
	
	//using ternary operator
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character that you want to check");
		char input = sc.next().charAt(0);

		String output = ((input == 'a' || input == 'e' || input == 'i'
				|| input == 'o' || input == 'u') || (input == 'A'
				|| input == 'E' || input == 'I' || input == 'O' || input == 'U')) ? (input + " is vowel")
				: (input + " is not a vowel");

		System.out.println(output);
		
		sc.close();
	}
}
