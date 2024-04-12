package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {
	
	
	
	public static void main(String[] args) {
		
		// There are four ways to insert element into ArrayList
		// 1) Inserting a single element at the end
		// add(E element)
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println(arrayList); // [10,30,40,50]
		//2)  Inserting a single element at a given index
		// add(int index, E element)
		arrayList.add(2, 20);
		System.out.println(arrayList); // [10,30,20,40,50]
		//3) Inserting multiple elements from another Collection to end of the ArrayList
		// addAll(Collection c)
		Set<Integer> set = new HashSet<Integer>();
		set.add(90);
		set.add(8);
		arrayList.addAll(set);
		System.out.println(arrayList); // [10,30,20,40,50,90,8]
		//4) Inserting multiple elements from another Collection at a particular index
		// addAll(int index, Collection c)
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(119);
		treeSet.add(109);
		arrayList.addAll(2, treeSet);
		System.out.println(arrayList); // [10,30,109,119,20,40,50,90,8]
		
		
		
		// Removing Elements from ArrayList
		// 1) Removing an element at a particular index
		arrayList.remove(1);
		System.out.println(arrayList);
		
		//2) Removing a particular element from the ArrayList
		arrayList.remove(Integer.valueOf(109));
		System.out.println(arrayList);
		
		// Removing all the elements within a range
		arrayList.removeAll(treeSet);
		System.out.println(arrayList);
	}
}
