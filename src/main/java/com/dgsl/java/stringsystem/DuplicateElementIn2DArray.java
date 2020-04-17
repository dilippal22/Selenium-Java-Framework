/*Write a Java Program to Find Duplicate Elements in Each Row of 2D Array.*/

package com.dgsl.java.stringsystem;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementIn2DArray { 

	public static void main(String[] args) {

		// input Array
		int[][] dArray = { { 4, 67, 34, 90 }, { 9, 4, 11, 100 },
				{ 6, 67, 9, 4 }, { 78, 87, 4, 2 } };

		// Declaring set to store expected duplicates
		Set<Integer> expectedDuplicate = new HashSet<Integer>();

		// Declaring to store next row element
		Set<Integer> deleteRow = new HashSet<Integer>();

		boolean duplicates = true;

		// Iterating through loop
		for (int i = 0; i < dArray.length; i++) {

			// This loop is for if every row has different number of elements
			for (int j = 0; j < dArray[i].length; j++) {

				// Assuming elements of first row are Duplicates
				if (i == 0) {
					expectedDuplicate.add(dArray[i][j]);

					// If not duplicate then add in another HashSet
				} else {
					deleteRow.add(dArray[i][j]);
				}
			}

			// Avoiding Intersection for first row
			if (i != 0) {

				// Intersection of two set
				expectedDuplicate.retainAll(deleteRow);

				// Emptying delete row
				deleteRow.clear();

				// Checking if Intersection makes expectedDuplicate size 0
				if (expectedDuplicate.size() == 0) {
					duplicates = false;
					break;
				}
			}
		}

		// Printing Duplicates
		if (duplicates) {
			System.out.println("Duplicate item in all rows: "
					+ expectedDuplicate);
		} else {
			System.out.println("There are no duplicate elements");
		}
	}

}
