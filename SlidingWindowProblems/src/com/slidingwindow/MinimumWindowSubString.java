package com.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumWindowSubString {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(-3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(-3);
		list2.add(1);
		list2.add(2);
		
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		set.add(list2);
		set.add(list);
		
		System.out.println(set);
		
	}
}
