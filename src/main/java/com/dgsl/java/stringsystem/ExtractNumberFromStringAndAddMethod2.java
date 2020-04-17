/*Write a Java Program to Extract Numbers From String and Add : #GeeKs12fOr@gEEks08*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ExtractNumberFromStringAndAddMethod2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String that you want to extract from");
		String input = sc.nextLine();

		String regEx = input.replaceAll("[^0-9$]", "");

		String[] number = regEx.split("");

		int sum = 0;

		for (String eachNum : number) {
			int result = Integer.parseInt(eachNum);
			sum = sum + result;

		}
		System.out.println(sum);

		sc.close();

	}

}
