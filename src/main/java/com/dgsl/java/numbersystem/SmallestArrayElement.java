/*Find Smallest and largest number from given array.*/

package com.dgsl.java.numbersystem;

public class SmallestArrayElement {

	public static void main(String[] args) {

		// Program to fine smallest number.
		int temp = 0;
		int arr[] = { 2, 5, 9, 6, 1, 3, 8, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Samllest element in the array is: " + arr[0]);
	}

}
