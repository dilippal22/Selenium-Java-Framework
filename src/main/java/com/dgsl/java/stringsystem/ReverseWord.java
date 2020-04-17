/*Write a program to reverse each word of a sentence.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Write the sentence you want to reverse");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
		sc.close();
	}

}
