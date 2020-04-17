/*Write a JAVA program to Print duplicate array element.*/

package com.dgsl.java.stringsystem;

public class PrintDuplicateArrayElement {

	public static void main(String[] args) {

		int[] userInput = { 5, 7, 8, 4, 6, 8, 2, 3, 6 };

		int duplicateCount = 0;

		for (int i = 0; i < userInput.length; i++) {

			for (int j = i + 1; j < userInput.length; j++) {

				if (userInput[i] == userInput[j]) {

					duplicateCount++;

					System.out.println("Duplicate Elements are: "
							+ userInput[i]);
				}
			}
		}
		System.out.println("Total Duplicates are: " + duplicateCount);
	}
}
