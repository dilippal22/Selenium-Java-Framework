package com.dgsl.java.thiskeywordconcept;

public class WithThisKeywordForVariable1 {

	int empID;
	String name;
	String companyName;

	WithThisKeywordForVariable1(int emp_ID, String nm, String company_Name) {
		empID = emp_ID;
		name = nm;
		companyName = company_Name;
	}

	void display() {
		System.out.print("empID: " + empID + "  " + "name: " + name + "  "
				+ "companyName: " + companyName + "\n");
	}

	public static void main(String[] args) {
		WithThisKeywordForVariable1 obj = new WithThisKeywordForVariable1(34584,
				"Dilip", "DGSL");
		obj.display();

		WithThisKeywordForVariable1 obj1 = new WithThisKeywordForVariable1(34658,
				"Anuj", "CDIS");
		obj1.display();
	}

}
