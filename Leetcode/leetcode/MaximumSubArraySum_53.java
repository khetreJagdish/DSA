package com.leetcode;

public class MaximumSubArraySum_53 {
	
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = maxSubArray(arr);
		System.out.println(maxSum);
	}
	
	
    public static int maxSubArray(int[] nums) {
        
        int result = nums[0];
        int maxEnding = nums[0];
        for(int i =1; i< nums.length; i++){
         maxEnding   = Math.max(maxEnding+nums[i], nums[i]);
         result = Math.max(maxEnding,result);
        }
    return result;
    }
}
