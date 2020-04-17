/* Print the common value from both the arrays*/

package com.dgsl.java.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int[] a = { 4, 8, 6, 2, 7, 9 };
		int[] b = { 1, 6, 2, 8, 9, 3 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j <= i; j++) {

				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
