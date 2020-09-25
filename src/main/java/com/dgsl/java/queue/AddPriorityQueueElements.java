package com.dgsl.java.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class AddPriorityQueueElements {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Brendon");
		queue.add("Bella");
		queue.add("Bran");

		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
