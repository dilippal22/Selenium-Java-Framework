/* Print pattern in following way
 * 0
 * 1 0
 * 0 1 0
 * 1 0 1 0
 * 0 1 0 1 0
 */

package com.dgsl.java.pattern;

import java.util.Scanner;

/**
 * @author dilip.pal
 *
 */

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print:");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i * j) % 2 + " ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
