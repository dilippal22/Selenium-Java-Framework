package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class LetterPositionInAlphabetMethod2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the letter you want to find position in Alphabet");
		char letter = sc.next().charAt(0);
		
		sc.close();

	}

}
