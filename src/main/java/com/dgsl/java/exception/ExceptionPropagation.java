package com.dgsl.java.exception;

public class ExceptionPropagation {

	public void methodM() {
		int data = 50 / 0;

	}

	public void methodN() {
		methodM();
	}

	public void methodP() {
		try {
			methodN();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException..");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.methodP();
		System.out.println("Normal Flow Execution..");
	}

}
