package com.leetcode;

public class Solution_2000 {
	
	public static void main(String[] args) {
		
		String s = reversePrefix("abcdefd", 'd');
		System.out.println(s);
	}
	
	public static String reversePrefix(String word, char ch) {
      
        
        if(word.contains(String.valueOf(ch))){
        	int index = word.indexOf(ch);
        	String reverse = word.substring(0, index+1);
        	StringBuilder builder = new StringBuilder(reverse);
        	String rev = builder.reverse().toString();
        	return rev+word.substring(index+1, word.length());
        }
        return word;
    }
	
}
