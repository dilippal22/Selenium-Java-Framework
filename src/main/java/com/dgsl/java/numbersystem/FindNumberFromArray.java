/*Write a program to check if array has given value.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class FindNumberFromArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to check in array");
		int num = sc.nextInt();

		boolean found = false;
		int arr[] = { 5, 6, 87, 7, 9, 45, 5, 2, 6 };

		for (int n : arr) {
			if (n == num) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(num + " is found in array");
		else
			System.out.println(num + " is not found in array");
		
		sc.close();
	}

}
