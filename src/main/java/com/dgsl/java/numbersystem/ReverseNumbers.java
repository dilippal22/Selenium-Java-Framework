/*Write a program to reverse number.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");

		int num = sc.nextInt();

		while(num!=0){
		sum = sum * 10+ num % 10;
		num = num / 10;
		}
		
		System.out.println("Reverse of number is:" +sum);
		
		sc.close();
	}

}
