package com.dgsl.java.accessmodifiers;

class AnotherModifiers {
	protected void whoAmI() {
		System.out.println("I am Another Modifier");
	}
}

public class AcessModifiers extends AnotherModifiers {
	public void whoAmI() {
		System.out.println("I am Access Modifier");
	}

	public static void main(String[] args) {
	}

}
