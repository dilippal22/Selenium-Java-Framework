/* In this java program, we will take a number variable and check whether the number is prime or not.*/

package com.dgsl.java.primenumber;

import java.util.Scanner;

public class PrimeNumberApproach1 {

	public static void main(String[] args) {

		int i, m = 0, flag = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Number");
		
		int n = sc.nextInt();

		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (i = 2; i <= n; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
			}
		}
	}
}
