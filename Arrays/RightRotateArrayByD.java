package com.leetcode;

public class RightRotateArrayByD {
		
	    public static int[] rotate(int[] nums, int k) {
	        
	        int n = nums.length;
	        
	        k = k%n;
	        int[] tmp  = new int[n-k];
	        
	        for(int i = 0; i< n-k; i++){
	             tmp[i]= nums[i];
	        }
	        
	        int count = 0;
	        for(int i = n-k; i<n;i++){
	            nums[count]= nums[i];
	            count++;
	        }
	        
	        for(int i = 0; i<tmp.length; i++){
	             nums[count]= tmp[i];
	            count++;
	        }
			return nums;
	        
	    }
	
	    public static void main(String[] args) {
			
	    	int[] arr = {-1,-100,3,99};
	    	 int[] finalArray =rotate(arr, 2);
	    	 
	    	 for(int i = 0; i<finalArray.length;i++) {
	    		 System.out.print(finalArray[i] + " ");
	    	 }
		}
}
