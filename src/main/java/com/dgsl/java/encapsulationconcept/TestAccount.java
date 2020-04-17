package com.dgsl.java.encapsulationconcept;

public class TestAccount {

	public static void main(String[] args) {

		Account acc = new Account();

		acc.setName("Dilip");
		acc.setEmail("dilip.pal@datamatics.com");
		acc.setAccNumber(987654321);
		acc.setAmount(50400.67f);

		System.out.print("Customer Account Details are: " + "\n"
				+ acc.getName() + "\n" + acc.getEmail() + "\n"
				+ acc.getAccNumber() + "\n" + acc.getAmount());
	}

}
