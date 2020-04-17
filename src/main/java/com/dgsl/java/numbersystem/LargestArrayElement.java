package com.dgsl.java.numbersystem;

public class LargestArrayElement {

	public static void main(String[] args) {
		// Program to fine largest number
		int temp = 0;
		int arr[] = { 56, 23, 89, 45, 12, 78, 89 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Largest element in the array is: " + arr[0]);
	}

}
