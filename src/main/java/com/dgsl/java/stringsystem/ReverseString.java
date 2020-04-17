/*Write a program to reverse given string.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse.");
		String input = sc.nextLine();

		char[] ch = input.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " ");

		}
		sc.close();
	}
}
