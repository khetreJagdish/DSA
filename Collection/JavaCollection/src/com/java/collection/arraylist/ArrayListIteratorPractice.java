package com.java.collection.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 		If we try to directly remove an element while iterating an ArrayList using an iterator is created, 
 *     then ConcurrentModificationException will also be thrown. 
 *     We should always use the remove() method in the iterator to remove an element from the ArrayList.
        The below program will fail because we are trying to delete the element from the list directly.
 * 
 * **/


public class ArrayListIteratorPractice {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int next = itr.next();
			
			if (next == 30) {
				list.remove(new Integer(30));
			}
		}
	}
}