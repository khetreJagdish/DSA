package com.tuf.recursion;

public class StringSubset {
	
	public static void main(String[] args) {
		
		subSet("ABC", "", 0);
	}
	
	public static void subSet(String s , String current , int index) {
		
		if(index == s.length()) {
			System.out.println(current);
			return;
		}
		
		subSet(s, current+s.charAt(index), index+1);
		subSet(s, current, index+1);
	}
}
