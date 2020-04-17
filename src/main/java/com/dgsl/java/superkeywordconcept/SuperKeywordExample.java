package com.dgsl.java.superkeywordconcept;

class Person {
	int empId;
	String name;
	float sal;

	Person(int empId, String name, float sal) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
}

class Employee extends Person {
	String company;

	Employee(int empId, String name, float sal, String company) {
		super(empId, name, sal);
		this.company = company;
	}

	void printDetails() {
		System.out.println("empId: " + empId + ", " + "name: " + name + ", "
				+ "sal: " + sal + ", " + "company: " + company);
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		Employee obj = new Employee(34584, "Dilip", 45.56f, "DGSL");
		obj.printDetails();
	}

}
