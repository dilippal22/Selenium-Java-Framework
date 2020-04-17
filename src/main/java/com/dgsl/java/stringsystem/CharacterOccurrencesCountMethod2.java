/*Write a program to print repeated character and the number of times they were repeated.*/

package com.dgsl.java.stringsystem;

import java.util.Scanner;

public class CharacterOccurrencesCountMethod2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string you want to check for");
		String input = sc.nextLine();
		
		System.out.println("Enter the character you want to check for");
		char ch = sc.next().charAt(0);
		
		int occurance = 0;
		
		for(int i=0; i<input.length();i++){
			if(ch == input.charAt(i)){
				++occurance;
			}
		}
		
		System.out.println("Occurance of " + ch + " = " + occurance);
		sc.close();
	}
	

}
