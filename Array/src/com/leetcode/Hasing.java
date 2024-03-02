package com.leetcode;

import java.util.HashMap;

public class Hasing {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> val = new HashMap<Integer, Integer>(100000);
		for (int i = 0; i < val.size(); i++) {
			val.put(i,i);
		}
		System.out.println(val);
	}
}
