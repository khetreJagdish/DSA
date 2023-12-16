package com.gfg.string;

public class CountOfEveryCharacterInString {
	
	public static void main(String[] args) {
		countCharacterInString("geeksforgeeks");
	}
	
	static void countCharacterInString(String str){

		int[] count = new int[26];
		
		for(int i =0; i<str.length();i++) {
			count[str.charAt(i) -'a']++;
		}
		
	}
	
}
