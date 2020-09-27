package com.dgsl.java.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("John");
		ll.add("Luther");
		ll.add("Dona");

		System.out.println("\n*****Printing linked list values for the first time*****");
		System.out.println(ll);

		// add first concept
		ll.addFirst("Trisha");

		// add last concept
		ll.addLast("Simona");

		System.out.println("\n*****Printing linked list values after adding first and last value*****");
		System.out.println(ll);

		// Add duplicate
		ll.add("Luther");
		System.out.println("\n*****Printing linked list values after addin duplicate value*****");
		System.out.println(ll);

		// Add value based on index
		ll.add(4, "Trimmer");
		System.out.println("\n*****Printing linked list values after adding based on index*****");
		System.out.println(ll);

		// Retrieve value by index
		System.out.println("\n*****Printing linked list values after retrieving value by index*****");
		System.out.println(ll.get(3));

		// Set the value based on index. When setting the value at the place of an
		// existing value then the old value gets replaced
		ll.set(3, "Trichy");
		System.out.println("\n*****Printing linked list values after setting value by index*****");
		System.out.println(ll);

		// Remove first and last value
		ll.removeFirst();
		ll.removeLast();
		System.out.println("\n*****Printing linked list values after removing first and last value*****");
		System.out.println(ll);

		// Remove value based on index
		ll.remove(1);
		System.out.println("\n*****Printing linked list values after removing first index value*****");
		System.out.println(ll);

		// Printing all the values for linked list using for loop
		System.out.println("\n*****Printing linked list values using for loop*****");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// Printing all the values for linked list using for enhanced loop
		System.out.println("\n*****Printing linked list values using enhanced loop*****");
		for (String str : ll) {
			System.out.println(str);
		}

		// Printing all the values for linked list using iterator interface
		System.out.println("\n*****Printing linked list values using iterator interface*****");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Printing all the values for linked list using while loop
		System.out.println("\n*****Printing linked list values using while loop*****");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
