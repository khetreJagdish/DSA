package com.leetcode;

public class StringJoinMethod {
	
	public static void main(String[] args) {
		String[] s1 = {"jagdish","krushna","khetre"};
		String[] s2 = {"jagd","ishkrus","hnakhetre"};
		System.out.println(isArraySame(s1,s2));
		
	}

	private static Boolean isArraySame(String[] s1, String[] s2) {
		
		System.out.println(String.join("", s1));
		System.out.println(String.join("", s2));
		return String.join("",s1).equals(String.join("", s2));
		
	}
}
