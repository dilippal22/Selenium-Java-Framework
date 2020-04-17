package com.dgsl.java.encapsulationconcept;

public class Account {

	private long accountNumber;

	private String name;

	private String email;

	private float amount;

	public void setAccNumber(long AccNumber) {
		this.accountNumber = AccNumber;
	}

	public long getAccNumber() {
		return accountNumber;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}

	public String getEmail() {
		return email;
	}

	public void setAmount(float amt) {
		this.amount = amt;
	}

	public float getAmount() {
		return amount;
	}

}
