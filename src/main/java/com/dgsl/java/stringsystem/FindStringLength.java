/*Write a JAVA program to Find Length of String Without Using Length Method.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class FindStringLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String you want to find length for");
		String input = sc.nextLine();
		
		sc.close();

		char[] word = input.toCharArray();

		int count = 0;

		for (char ch : word) {
			count++;
		}
		System.out.println(count);

		sc.close();
	}

}
