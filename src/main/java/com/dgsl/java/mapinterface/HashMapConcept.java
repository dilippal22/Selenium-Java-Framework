package com.dgsl.java.mapinterface;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// 1. HashMap is a class which implements Map interface and extends AbstractMap
		// 2. It contains only unique key but duplicate values
		// 3. Stores in key-value pair
		// 4. It can have one null key and multiple null values
		// 5. It maintains no insertion orders
		// 6. HashMap is non-synchronized hence thread-fail
		// 7. Concurrent modification exception situation - fail fast situation

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Patrick");
		hm.put(2, "Tredos");
		hm.put(3, "Panther");

		// Printing HashMap value using enhanced for loop
		System.out.println("*****Printing HashMap value using enhanced for loop*****");
		for (Entry map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

		// Printing HashMap value using key
		System.out.println("\n*****Printing HashMap value using key*****");
		System.out.println(hm.get(1));

		// Printing HashMap value after removing one element
		System.out.println("\n*****Printing HashMap value after removing one element*****");
		hm.remove(2);
		System.out.println(hm);

		// Printing HashMap values using Employee Object
		HashMap<Integer, Employee> hMap = new HashMap<Integer, Employee>();

		// Creating Employee object
		Employee emp1 = new Employee("Presto", 23, "QA");
		Employee emp2 = new Employee("Steve", 37, "Manager");
		Employee emp3 = new Employee("Patro", 32, "Lead");

		hMap.put(1, emp1);
		hMap.put(2, emp2);
		hMap.put(3, emp3);

		// Traversing through HashMap values
		for (Entry<Integer, Employee> m : hMap.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();

			System.out.println("\n******Printing Employee values for key: " + key + "*****");
			System.out
					.println("Emplyee Name: " + e.eName + "\nEmployee Age: " + e.eAge + "\nEmployee Dept: " + e.eDept);
		}

	}

}
