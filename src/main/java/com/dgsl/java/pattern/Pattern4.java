/* Print pattern in following way i.e print in reverse order
 * 5 10 15 20 25
 * 4 8 12 16
 * 3 6 9
 * 2 4
 * 1
 */

package com.dgsl.java.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print!");
		int rows = sc.nextInt();

		for (int i = rows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i*j) + " ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
