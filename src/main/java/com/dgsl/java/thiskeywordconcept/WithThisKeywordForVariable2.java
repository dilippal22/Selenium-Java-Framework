package com.dgsl.java.thiskeywordconcept;

public class WithThisKeywordForVariable2 {

	int empID;
	String name;
	String companyName;

	WithThisKeywordForVariable2(int empID, String name, String companyName) {
		this.empID = empID;
		this.name = name;
		this.companyName = companyName;
	}

	void display() {
		System.out.print("empID: " + empID + "  " + "name: " + name + "  "
				+ "companyName: " + companyName + "\n");
	}

	public static void main(String[] args) {
		WithThisKeywordForVariable2 obj = new WithThisKeywordForVariable2(
				34584, "Dilip", "DGSL");
		obj.display();

		WithThisKeywordForVariable2 obj1 = new WithThisKeywordForVariable2(
				34658, "Anuj", "CDIS");
		obj1.display();
	}

}
