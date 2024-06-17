package com.gfg;

public class GFG {
	
	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
		
	}
	
	 public static int singleNumber(int[] nums) {
	        int result=0;
	        for(int i=0; i<nums.length; i++) {
	            result = result^nums[i];
	        }
	        return result;
	    }
}
