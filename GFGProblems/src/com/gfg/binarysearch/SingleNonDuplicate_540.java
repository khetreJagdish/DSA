package com.gfg.binarysearch;

public class SingleNonDuplicate_540 {
	
	 public static int singleNonDuplicate(int[] nums) {
	        
	        int n = nums.length;
	        if(nums.length == 1) return nums[0];

	        for(int i = 1; i<n-1;i++){
	            if(nums[0] != nums[1]) return nums[0];
	            if(nums[n-1] != nums[n-2]) return nums[n-1];

	            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
	                return nums[i];
	            }
	        }
	        return -1;
	    }
	 
	 public static void main(String[] args) {
		
		 int[] arr = {1,2,2};
		 int res = singleNonDuplicate(arr);
		 System.out.println(res);
	}
}
