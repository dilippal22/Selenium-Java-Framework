/*Write a program to reverse array numbers.*/

package com.dgsl.java.numbersystem;

public class ReverseArrayNumbers {

	public static void main(String[] args) {

		int[] value = { 10, 20, 30, 40 };

		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i] + " ");
		}
	}

}
