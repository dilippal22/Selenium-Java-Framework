package com.dgsl.java.numbersystem;

public class PrintValueInAscendingOrder {

	public static void main(String[] args) {

		int a = 50;
		int b = 100;
		int c = 20;

		int temp;

		for (int count = 0; count < 3; count++) {
			if (b < a) {
				temp = a;
				a = b;
				b = temp;
			}

			if (c < b) {
				temp = b;
				b = c;
				c = temp;
			}
		}

		System.out.println("a: " + a + "\nb: " + b + "\nc: " + c);
	}

}
