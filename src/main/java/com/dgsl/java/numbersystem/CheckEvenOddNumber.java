/*Write a program to check if the given number is even or odd.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class CheckEvenOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the number that you want check for even or odd");
		int num = sc.nextInt();

		String output = (num % 2 == 0) ? (num + " is even number")
				: (num + " is odd number");

		System.out.println(output);
		
		sc.close();
	}
}
