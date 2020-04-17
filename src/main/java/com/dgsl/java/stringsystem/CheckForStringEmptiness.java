/*Write a Java program to check if String is empty or null.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class CheckForStringEmptiness {

	public static boolean isNullorEmpty(String s) {
		if (s != null && !s.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the string you want to check for null or empty");
		String input = sc.nextLine();

		/*if (isNullorEmpty(input)) {
			System.out.println("String is null or empty");
		} else {
			System.out.println("String is not null or empty");
		}*/
		
		
		// Alternate of if..else condition using Ternary operator
		String output = (isNullorEmpty(input)) ? ("String is null or empty")
				: ("String is not null or empty");
		System.out.println(output);
		
		sc.close();

	}
}
