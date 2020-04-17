/*Find average of the given values in an array.*/

package com.dgsl.java.numbersystem;

public class AverageArrayElement {

	public static void main(String[] args) {

		int sum = 0;
		int arr[] = { 26, 9, 0, 96, -5, 65, 16, 23 };

		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}

		System.out.println("Average of array element is:" + sum / arr.length);
	}
}
