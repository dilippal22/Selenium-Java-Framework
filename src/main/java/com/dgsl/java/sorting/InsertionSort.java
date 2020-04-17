/* Insertion Sort [ 9, 14, 3, 2, 43, 11, 58, 22 ]*/

package com.dgsl.java.sorting;

public class InsertionSort {

	public static void insertionSort(int insertion[]) {
		int size = insertion.length;

		for (int i = 1; i < size; i++) {
			int key = insertion[i];
			int j = i - 1;
			while ((j > -1) && (insertion[j] > key)) {
				insertion[j + 1] = insertion[j];
				j--;
			}
			insertion[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		int insertion[] = {9, 14, 3, 2, 43, 11, 58, 22};

		System.out.println("Array before Insertion Sort!");
		for (int i = 0; i < insertion.length; i++) {
			System.out.print(insertion[i] + " ");
		}

		insertionSort(insertion);

		System.out.println("\n");

		System.out.println("Array after Insertion Sort!");
		for (int i = 0; i < insertion.length; i++) {
			System.out.print(insertion[i] + " ");
		}
	}

}
