package com.gfg;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String revString = revStr("Jagdish");
		
		System.out.println(revString);
		
		
	}
	
	
	 static String revStr(String S) {
	        // code here
	        
	       int length = S.length();
	       
	       String reverse = "";
	       
	       while(length > 0) {
	    	   
	    	   reverse = reverse + S.charAt(length-1);
	    	   
	    	   length--;
	       }
	       
	       return reverse;
	    }
}
