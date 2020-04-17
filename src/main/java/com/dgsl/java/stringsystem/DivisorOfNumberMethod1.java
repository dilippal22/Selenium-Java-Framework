/*Write a JAVA program to find the divisors of a given number.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class DivisorOfNumberMethod1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose you want to check divisor");
		int input = sc.nextInt();

		System.out.println("Enter the divisor");
		int divisor = sc.nextInt();

		if (input % 7 == 0) {
			System.out.println(input + " is divisible by " + divisor);
		} else if (input % 7 != 0) {
			System.out.println(input + " is not divisible by " + divisor);
		} else {
			System.out.println("Invalid Number");
		}
		sc.close();
	}
}
