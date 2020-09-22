package com.dgsl.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AddArrayListElement {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to arraylist object
		al.add("Sachin");
		al.add("Brian");
		al.add(1, "Matthew");
		al.add("Matthew");

		// Traversing list using iterator interface
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
