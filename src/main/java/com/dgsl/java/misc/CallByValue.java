package com.dgsl.java.misc;

public class CallByValue {

	int data = 100;

	void change(CallByValue localobj) {
		localobj.data = localobj.data + 100;// changes will be in the instance variable
	}

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		System.out.println("Before change: " + obj.data); // 100

		obj.change(obj); // calling method using object

		System.out.println("After change: " + obj.data); // 200
	}

}
