package com.recursion;

public class SubSequencesOfString {
	
	public static void main(String[] args) {
		
		subSequences("ABC","",0);
	}

	private static void subSequences(String s, String output, int index) {
		
		if(s.length() == index) {
			System.out.println(output);
			return;
		}
		
		subSequences(s, output, index+1);
		subSequences(s, output+s.charAt(index), index+1);
		
	}
}
