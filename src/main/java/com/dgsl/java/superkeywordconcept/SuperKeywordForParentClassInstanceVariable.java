package com.dgsl.java.superkeywordconcept;

class parentClass {

	int empId = 34584;
	String name = "Dilip";
	float sal = 125.45f;
	String company = "DGSL";
}

class childOfParentClass extends parentClass {

	int empId = 1111;
	String name = "Vikas";
	float sal = 45.12f;
	String company = "ABCD";

	void printDetail() {

		System.out.println("empId: " + empId + ", " + "name: " + name + ", "
				+ "sal: " + sal + ", " + "company: " + company);

		System.out.println("empId: " + super.empId + ", " + "name: "
				+ super.name + ", " + "sal: " + super.sal + ", " + "company: "
				+ super.company);
	}
}

class SuperKeywordForParentClassInstanceVariable {
	public static void main(String[] args) {
		childOfParentClass obj = new childOfParentClass();
		obj.printDetail();
	}
}
