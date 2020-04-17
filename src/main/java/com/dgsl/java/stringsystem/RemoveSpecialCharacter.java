/*Write a program to remove special character, numbers or alphabets : #GeeKs01fOr@gEEks07*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Write the sentence that you want to remove from");
		String input = sc.nextLine();

		String regEx = input.replaceAll("[^A-za-z0-9$]", "");

		System.out.println(regEx);

		sc.close();
	}
}
