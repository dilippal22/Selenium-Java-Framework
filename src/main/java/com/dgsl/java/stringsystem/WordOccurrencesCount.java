/*Write a program to print the repeated word and the number of times they were repeated in a sentence.*/

package com.dgsl.java.stringsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordOccurrencesCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter the word that you want to count for occurances");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String ch : word) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%d : %s %n", entry.getValue(),
						entry.getKey());
			}
		}
		
		sc.close();
	}
}
