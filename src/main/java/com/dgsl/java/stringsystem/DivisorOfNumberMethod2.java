/*Write a JAVA program to find the divisors of a given number.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class DivisorOfNumberMethod2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose you want to check divisor");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.print(i + " ");
			}
			sc.close();
		}
	}
}
