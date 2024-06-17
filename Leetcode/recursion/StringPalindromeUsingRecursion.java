package com.recursion;

public class StringPalindromeUsingRecursion {
	
	public static void main(String[] args) {
		Boolean ans = isPalindrome("MalayalaM",0,"Malayalam".length()-1);
		System.out.println(ans);
	}
	
	static boolean isPalindrome(String str , int start , int end) {
		// abba
		if(start >= end) {
			return true;
		}
		
		return ((str.charAt(start) == str.charAt(end)) && (isPalindrome(str, start+1, end-1)));
		
		
	}
}
