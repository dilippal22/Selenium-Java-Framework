/*Write a program to Add a number.*/

package com.dgsl.java.numbersystem;

import java.util.Scanner;

public class AddingNumbers {
	
	public static void main(String[] args){
		
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to add");
		
		int num = sc.nextInt();
		
		while(num>0){
		sum = sum + num%10;
		num = num/10;
		}
		
		System.out.println("Reversed number is:" + sum);
		
		sc.close();
	}

}