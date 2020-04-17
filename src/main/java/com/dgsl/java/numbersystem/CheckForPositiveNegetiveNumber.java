/*Write a program to check if the given number is positive or negetive.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class CheckForPositiveNegetiveNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to check");
		double input = sc.nextInt();

		String output = (input > 0.0) ? (input + " is a Positive number")
				: (input < 0.0) ? (input + " is a negetive number")
						: (input + " is 0");

		System.out.println(output);
		
		sc.close();
	}
}
