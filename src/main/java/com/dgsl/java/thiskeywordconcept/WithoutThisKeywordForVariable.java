package com.dgsl.java.thiskeywordconcept;

public class WithoutThisKeywordForVariable {

	int empID;
	String name;
	String companyName;

	WithoutThisKeywordForVariable(int empID, String name, String companyName) {
		empID = empID;
		name = name;
		companyName = companyName;
	}

	void display() {
		System.out.print("empID: " + empID + "  " + "name: " + name + "  " + "companyName: "
				+ companyName + "\n");
	}

	public static void main(String[] args) {
		WithoutThisKeywordForVariable obj = new WithoutThisKeywordForVariable(34584, "Dilip", "DGSL");
		obj.display();

		WithoutThisKeywordForVariable obj1 = new WithoutThisKeywordForVariable(34658, "Anuj", "CDIS");
		obj1.display();
	}

}
