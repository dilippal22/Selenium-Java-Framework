/*Write a program to print only repeated character in a given sentence.*/

package com.dgsl.java.stringsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccurancesInSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence that you want to check for");
		String input = sc.nextLine();

		String[] word = input.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String ch : word) {
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
