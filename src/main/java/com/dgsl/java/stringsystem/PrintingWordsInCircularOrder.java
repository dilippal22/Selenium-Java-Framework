/*Write a program to Print Words based on the index : datamatics global services*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class PrintingWordsInCircularOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence you want to print");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		System.out
				.println("Enter the index number you want to print string from");
		int index = sc.nextInt();

		if (index >= 0 && index < word.length) {

			for (int i = index; i < word.length; i++) {
				System.out.print(word[i] + " ");
			}

			for (int j = 0; j < index; j++) {
				System.out.print(word[j] + " ");
			}
		} else {
			System.out.println("Invalid Index");
		}

		sc.close();

	}
}
