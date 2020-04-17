/* Print pattern in following way
 * 						1
 * 					1	2	1
 * 				1	2	3	2	1			
 * 			1	2	3	4	3	2	1
 * 		1	2	3	4	5	4	3	2	1
 */

package com.dgsl.java.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int rows = sc.nextInt();

		int forOddLine = 1;
		int forSpace = rows - 1;

		//This loop is for row
		for (int i = 1; i <= rows; i++) {

			//Printing spaces
			for (int j = 0; j < forSpace; j++) {
				System.out.print(" ");
			}

			int k = 0;
			
			//This loop is for column
			for (int j = 1; j <= forOddLine; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			
			//For next row
			System.out.println();
			
			//To define the number of digits is to print in a row
			forOddLine = forOddLine + 2;
			
			//TO subtract the spaces as you go down the row
			forSpace = forSpace - 1;
		}
		
		sc.close();

	}

}
