package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class IteratingArrayListUsingForLoop {
	public static void main(String[] args) {
		
		// Using for Loop
		List <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		 
		for (int i = 0; i < list.size(); i++) { //Simple for loop
			System.out.println(list.get(i));
		}

		for (Integer i : list) {   //Enhanced for loop
			System.out.println(i);
		}
		
		
	}
}
