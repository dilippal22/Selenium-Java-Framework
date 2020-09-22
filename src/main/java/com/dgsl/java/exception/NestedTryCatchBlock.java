package com.dgsl.java.exception;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement..");
			int c = 10 / 0;

		} catch (Throwable e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}

}
