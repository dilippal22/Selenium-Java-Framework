/* Print pattern in following way
 * 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 * 5 10 15 20 25
 */

package com.dgsl.java.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print:");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
