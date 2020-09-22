package com.dgsl.java.stringsystem;

public class ConvertArrayToString {

	public static void main(String[] args) {

		char charArray[] = { 'j', 'a', 'v', 'a' };

		System.out.println(new String(charArray));
		
		System.out.println(String.valueOf(charArray));
		
		for(char ch : charArray) {
			System.out.println(ch);
		}

	}

}
