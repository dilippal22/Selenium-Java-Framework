/*Write a program to print * in Equilateral Triangle.

      * 
     * * 
    * * * 
   * * * * 
  * * * * *
*/

package com.dgsl.java.pattern;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int rows = sc.nextInt();

		int forSpace = rows - 1;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < forSpace; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {

				System.out.print("*" + " ");
			}
			System.out.println();

			forSpace = forSpace - 1;
		}

		sc.close();
	}
}
