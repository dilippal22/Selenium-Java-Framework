package com.dgsl.java.objectcloningconcept;

public class Student implements Cloneable {

	int rollNumber;
	String studentName;

	public Student(int rollNum, String studName) {

		this.rollNumber = rollNum;
		this.studentName = studName;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		try {
			Student s1 = new Student(67, "Dilip");

			Student s2 = (Student) s1.clone();

			System.out.println(s1.rollNumber + " " + s1.studentName);

			System.out.println(s2.rollNumber + " " + s2.studentName);
		} catch (CloneNotSupportedException e) {

		}
	}
}
