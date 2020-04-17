/*We can create a fully encapsulated class in Java by making all the data members of the class private.
 * Now we can use setter and getter methods to set and get the data in it.*/

package com.dgsl.java.encapsulationconcept;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name = nm;
	}

}
