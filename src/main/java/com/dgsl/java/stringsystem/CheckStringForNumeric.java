/*Write a program to check if given input string is integer or not.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class CheckStringForNumeric {

	public static boolean CheckInput(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check");
		String input = sc.nextLine();

		/*
		 * if (CheckInput(input)) { System.out.println("Integer"); } else {
		 * System.out.println("not an Integer"); }
		 */

		// Alternative of if..else condition using Ternary operator
		String output = (CheckInput(input)) ? ("Integer") : ("not an Integer");
		System.out.println(output);

		sc.close();
	}
}
