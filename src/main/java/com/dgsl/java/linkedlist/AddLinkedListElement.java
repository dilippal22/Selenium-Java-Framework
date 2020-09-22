package com.dgsl.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class AddLinkedListElement {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add element to linked list object
		ll.add("John");
		ll.addFirst("Donald");
		ll.addLast("Popaye");
		ll.add("Peter");

		// iterate through element to print it
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
