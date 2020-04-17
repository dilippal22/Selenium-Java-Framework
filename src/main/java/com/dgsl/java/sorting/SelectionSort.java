/* Search for the lowest element and arrange it to the proper location.
 * Swap the current element with the next lowest number.
 * [ 5, 1, 7, 21, 16, 2, 12, 14 ]*/

package com.dgsl.java.sorting;

public class SelectionSort {

	static void selectionSort(int selection[]) {
		int size = selection.length;
		int temp = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (selection[i] > selection[j]) {
					temp = selection[i];
					selection[i] = selection[j];
					selection[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int selection[] = { 5, 1, 7, 21, 16, 2, 12, 14 };

		System.out.println("Array before Selection Sort!");
		for (int i = 0; i < selection.length; i++) {
			System.out.print(selection[i] + " ");
		}
		System.out.println();

		selectionSort(selection);

		System.out.println("Array after Selection Sort!");
		for (int i = 0; i < selection.length; i++) {
			System.out.print(selection[i] + " ");
		}
	}
}
