package com.dgsl.java.palindrome;

import java.util.Scanner;

public class PalindromeMethod1 {

	public static void main(String[] args) {

		int n, r, temp, sum = 0;

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter an int"); String org = sc.nextLine(); n =
		 * org.length();
		 */

		n = 666;

		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
