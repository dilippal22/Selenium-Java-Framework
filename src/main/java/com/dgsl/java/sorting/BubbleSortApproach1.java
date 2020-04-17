/* Write a java program to sort following array elements using bubble sort algorithm.
 * [18 9 33 4 84 32]
 */

package com.dgsl.java.sorting;

import java.util.Arrays;

public class BubbleSortApproach1 {

	public static void bubbleSort(int bubble[]) {
		int i, j, temp = 0;
		int size = bubble.length;

		for (i = 0; i <= size; i++) {
			for (j = 1; j < (size - i - 1); j++) {
				if (bubble[j - 1] > bubble[j]) {
					temp = bubble[j];
					bubble[j] = bubble[j - 1];
					bubble[j - 1] = temp;
				}
				System.out.println(Arrays.toString(bubble));
			}

			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int bubble[] = { 18, 9, 33, 4, 84, 32 };

		System.out.println("Array before Sorting!");
		System.out.println(Arrays.toString(bubble));

		System.out.println("Array after Sorting!");
		System.out.println(Arrays.toString(bubble));
		bubbleSort(bubble);
	}
}
