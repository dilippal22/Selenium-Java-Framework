package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ConvertArrayToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string..");
		String input = sc.nextLine();

		char[] charArray = input.toCharArray();

		// Converting array to string - method 1
		System.out.println(new String(charArray));

		// Converting array to string - method 2
		System.out.println(String.valueOf(charArray));

		// Converting array to string - method 3
		for (char ch : charArray) {
			System.out.println(ch);
		}

		sc.close();

	}

}
