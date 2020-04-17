package com.dgsl.java.thiskeywordconcept;

public class ThisKeywordExample {

	int empId;
	String name;
	String company;
	float sal;

	ThisKeywordExample(int empId, String name, float sal) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	ThisKeywordExample(int empId, String name, float sal, String company) {
		this(empId, name, sal);
		this.company = company;
	}

	public void display() {
		System.out.println("empId: " + empId + " " + "name: " + name + " "
				+ "sal: " + sal + " " + "company: " + company);
	}

	public static void main(String[] args) {

		ThisKeywordExample obj = new ThisKeywordExample(34584, "Dilip", 12000.45f,
				"DGSL");
		obj.display();
	}

}
