/*Write a program for pallindrome.*/

package com.dgsl.java.palindrome;

import java.util.Scanner;

public class PalindromeMethod2 {

	public static void main(String[] args) {

		int sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the number that you want to check for pallindrome");
		int num = sc.nextInt();
		
		temp = num;

		while (num != 0) {
			sum = sum * 10 + num % 10;
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("Given number is Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}
