/*Swap two numbers without using third variable.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first variable value");
		int a = sc.nextInt();

		System.out.println("Enter the second variable value");
		int b = sc.nextInt();

		a = a + b; // 12
		b = a - b; // 5
		a = a - b; // 7

		System.out.println("Value of first variable is: " + a);

		System.out.println("Value of second variable is: " + b);
		
		sc.close();
	}

}
