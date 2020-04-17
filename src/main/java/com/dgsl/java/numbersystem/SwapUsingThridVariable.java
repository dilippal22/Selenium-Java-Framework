/*Write a program to swap two numbers using third variable.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class SwapUsingThridVariable {

	public static void main(String[] args) {

		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();

		System.out.println("Enter the second number");
		int b = sc.nextInt();

		temp = a;
		a = b;
		b = temp;

		System.out.println("First number after swap is: " + a);
		System.out.println("Second number after swap is: " + b);

		sc.close();

	}
}
