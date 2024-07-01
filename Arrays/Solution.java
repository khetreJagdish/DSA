package com.leetcode;
class Solution {

    public static void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        long aCount = 0;
        long bCount = 0;
        for(int i = 0; i<a.length; i++){
          
        	if(a[i] > b[i]) {
        		aCount++;
        	}else if(a[i] < b[i]) {
        		bCount++;
        	}
        }
        
        System.out.println(aCount + " "+ bCount);
        
    }
    
    public static void main(String[] args) {
		
    	long[] l1= {4 ,2, 7};
    	long[] l2= {5 ,6 ,3};
    	
    	scores(l1, l2);
    	
	}
}