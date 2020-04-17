/*Write a program to print Floyd's Triangle of natural number.

1
2	3
4	5	6
7	8	9	10
11	12	13	14	15*/

package com.dgsl.java.pattern;

import java.util.Scanner;

public class FloydTrianglePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int rows = sc.nextInt();

		int k = 0;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j <= i; j++) {
				k++;
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
