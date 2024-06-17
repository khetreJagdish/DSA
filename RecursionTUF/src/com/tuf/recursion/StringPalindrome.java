package com.tuf.recursion;

public class StringPalindrome {
	
	 public static boolean isPalindrome(String s) {
	        
	        char[] ch = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
	        String s1 = new String(ch);
	        System.out.println(s1);
	        return isStringPalindrome(s1,0,s1.length()-1);
	    }
	    static boolean isStringPalindrome(String s1,int start,int end){

	        if(start > end){
	            return true;
	        }

	        if(s1.charAt(start) != s1.charAt(end)){
	            return false;
	        }

	        return isStringPalindrome(s1, start+1, end-1);

	    }
	    
	    public static void main(String[] args) {
			System.out.println(isPalindrome("Malayalam"));
		}
	
}
