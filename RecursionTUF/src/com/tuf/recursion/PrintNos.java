package com.tuf.recursion;

import java.util.Arrays;

public class PrintNos {
	
	    public static int[] printNos(int x) {
	        // Write Your Code Here

	      int[] arr = new int[x];
	      return printNo(arr,x);
	        
	    }

	    static int[] printNo(int[] arr, int x){
	        if(x == 0) return arr;
	        arr[x-1] = x;
	        x--;
	        return printNo(arr,x);
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(Arrays.toString(printNos(5)));
		}
	
}
