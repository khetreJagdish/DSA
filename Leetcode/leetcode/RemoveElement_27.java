package com.leetcode;

public class RemoveElement_27 {
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,2,3};
		System.out.println(removeElement(arr, 3));;
	}
	
	  public static int removeElement(int[] nums, int val) {
	        //[3,2,2,3], val = 3
	        int i = 0;
	        for(int j = 0; j< nums.length; j++ ){
	           
	           if(nums[j] != val){

	             int temp = nums[i]; 
	             nums[i] = nums[j];
	             nums[j]  = temp;
	                i++;
	           }
	        }

	        return i;

	    }
}
