/*Write a program to print repeated character and the number of times they were repeated.*/

package com.dgsl.java.stringsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharacterOccurrencesCountMethod1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input you want to check for");
		String input = sc.nextLine();

		char[] word = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : word) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%d : %s %n", entry.getValue(),
						entry.getKey());
			}
		}
		sc.close();
	}

}
