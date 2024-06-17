package com.leetcode;

public class FinalValueOfVariable_2011 {
	
	public static void main(String[] args) {
		
		String[] arr = {"--X","X++","X++"};
		int val = finalValueAfterOperations(arr);
		System.out.println(val);
	}
	
	 public static int finalValueAfterOperations(String[] operations) {
	        
		 int res = 0;
	        
	        for(int i = 0;i< operations.length;i++)
	            if(operations[i].charAt(1) == '+')res++;
	            else res--;
	        
	        return res;
	    }
}
