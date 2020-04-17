/* Write a program to find the index of given number using bubble search {2, 3, 9, 11, 14, 22, 43, 58}*/

package com.dgsl.java.searching;

public class BinarySearch {

	public static void binarySearch(int binary[], int firstIndex,
			int lastIndex, int key) {
		int midIndex = (firstIndex + lastIndex) / 2;

		while (firstIndex <= lastIndex) {
			if (binary[midIndex] < key) {
				firstIndex = midIndex + 1;
			} else if (binary[midIndex] == key) {
				System.out.println("Element found at index: " + midIndex);
				break;
			} else {
				lastIndex = midIndex - 1;
			}
			midIndex = (firstIndex + lastIndex) / 2;
		}
		if (firstIndex > lastIndex) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String[] args) {
		// int bubble[] = { 9, 14, 3, 2, 43, 11, 58 };

		// Sort the unsorted Array
		// Arrays.sort(bubble);

		int bubble[] = { 2, 3, 9, 11, 14, 22, 43, 58 };

		int key = 11;
		int lastIndex = bubble.length - 1;
		binarySearch(bubble, 0, lastIndex, key);
	}

}
