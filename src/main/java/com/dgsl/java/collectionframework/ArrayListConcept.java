package com.dgsl.java.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		// 1. Accepts duplicate value 2. Maintains insertion order 3. Synchronized hence
		// thread-safe 4. Allows random access of object retrieval based on index

		ArrayList<String> al = new ArrayList<String>();
		al.add("Tom");
		al.add("Peter");
		al.add("Martin");

		System.out.println("*****Printing array list values for the very first time*****");
		System.out.println(al.size());

		al.add("Sam");
		al.add("John");
		// Contains duplicate
		al.add("Tom");

		System.out.println("\n*****Printing after adding duplicate value*****");
		System.out.println(al.size());

		// Index based retrieval
		System.out.println("\n*****Printing value based on index*****");
		System.out.println(al.get(4));

		// To print all the values from array list using for loop
		System.out.println("\n****Printing all the values from array list using for loop*****");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// Declaring this way if object type is not known. T is used to refer any type;
		// E for element type; N for number type; V as value and K as key
		ArrayList<E> ar = new ArrayList<E>();

		// Creating Employee object
		Employee emp1 = new Employee("Tom", 32, "QA");
		Employee emp2 = new Employee("Peter", 35, "Dev");
		Employee emp3 = new Employee("Martin", 37, "HR");

		ArrayList<Employee> arList = new ArrayList<Employee>();
		arList.add(emp1);
		arList.add(emp2);
		arList.add(emp3);

		// Iterator to traverse through Employee object
		Iterator<Employee> itr = arList.iterator();
		while (itr.hasNext()) {
			System.out.println("\n*****Printing Employee value*****");
			Employee emp = itr.next();
			System.out.println(emp.eName);
			System.out.println(emp.eAge);
			System.out.println(emp.eDept);

		}

		// addAll() method concept
		ArrayList<String> aList1 = new ArrayList<String>();
		aList1.add("Muthu");
		aList1.add("Krishnan");
		aList1.add("Swami");

		ArrayList<String> aList2 = new ArrayList<String>();
		aList2.add("Tinu");
		aList2.add("Chiku");
		aList2.add("Pintu");

		// Adding second list object into first list object
		aList1.addAll(aList2);

		System.out.println("\n*****Printing all the values from the first array list*****");
		for (int i = 0; i < aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}

		// removeAll() method concept
		aList1.removeAll(aList2);

		System.out.println("\n*****Removing all the values of second array list from the first array list*****");
		for (int i = 0; i < aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}

		// retainAll() method concept
		ArrayList<String> aList3 = new ArrayList<String>();
		aList3.add("Danny");
		aList3.add("Pran");
		aList3.add("Cheema");

		ArrayList<String> aList4 = new ArrayList<String>();
		aList4.add("Amrish");
		aList4.add("Danny");
		aList4.add("Daaga");

		aList3.retainAll(aList4);

		System.out.println("\n*****Printing common values only from both the array list*****");
		for (int i = 0; i < aList3.size(); i++) {
			System.out.println(aList3.get(i));
		}

		// Printing all value of ArrayList using lambda
		System.out.println("\n*****Printing all the values of ArrayList using lambda*****");
		aList4.forEach(names -> {
			System.out.println(names);
		});

		// Printing all value of ArrayList using iterator
		System.out.println("\n*****Printing all the values of ArrayList using iterator*****");
		Iterator<String> it = aList4.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Printing all value of ArrayList using for each remaining method
		System.out.println("\n*****Printing all the values of ArrayList using for each remaining method*****");
		it = aList4.iterator();
		it.forEachRemaining(names -> {
			System.out.println(names);
		});

		// Printing all value of ArrayList using for each loop
		System.out.println("\n*****Printing all the values of ArrayList using for each loop*****");
		for (String str : aList4) {
			System.out.println(str);
		}

		// Printing all value of ArrayList using for loop
		System.out.println("\n*****Printing all the values of ArrayList using for loop*****");
		for (int i = 0; i < aList4.size(); i++) {
			System.out.println(aList4.get(i));
		}

		// Printing all value of ArrayList using list iterator to traverse in both the
		// direction
		System.out.println(
				"\n*****Printing all the values of ArrayList using list iterator to traverse in both the direction*****");
		ListIterator<String> ltr = aList4.listIterator(aList4.size());
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}

	}

}
