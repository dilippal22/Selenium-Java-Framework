/*Write a program to print only repeated character of a given word : LLMMKPOLEUU*/

package com.dgsl.java.stringsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurrencesInWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the string you want to check for Occurrences");
		String input = sc.nextLine();

		char[] word = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : word) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				System.out.println(ch);
			} else {
				map.put(ch, 1);
			}
		}
		sc.close();
	}
}
