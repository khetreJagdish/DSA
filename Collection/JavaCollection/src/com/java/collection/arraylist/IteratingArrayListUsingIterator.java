package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayListUsingIterator {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Iterating using forEachRemaining() method
		System.out.println("Iterating using forEachRemaining() method");
		Iterator<Integer> newItr = list.iterator();
		// After creating Itertor if we add the element into list , we will get ConcurrentModificationException
		list.add(50);
		newItr.forEachRemaining(element -> System.out.println(element));
	}
}
