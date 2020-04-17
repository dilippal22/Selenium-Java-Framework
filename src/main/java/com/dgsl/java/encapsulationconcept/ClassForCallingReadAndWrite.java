package com.dgsl.java.encapsulationconcept;

public class ClassForCallingReadAndWrite {

	public static void main(String[] args) {

		ReadOnlyGetterClassConcept r = new ReadOnlyGetterClassConcept();

		System.out.println(r.getCompany());

		WriteOnlySetterClassConcept w = new WriteOnlySetterClassConcept();

		w.setCompany("datamatics");
		
	}

}
