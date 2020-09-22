package com.dgsl.java.exception;

public class Exception {

	public void exceptionScenario() throws ArithmeticException {
		try {
			int a = 5 / 0;
			System.out.println("Printing a: " + a);
		} finally {
			System.out.println("Executing from finally block");

			// This is instructing the program to terminate
//			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Exception e = new Exception();
		e.exceptionScenario();
	}

}
