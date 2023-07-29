package com.leetcode;

public class MaximumCircularSubArraySum {
	
	public static void main(String[] args) {
		int[] arr = {8,-4,3,-5,4};
		System.out.println(maximumOverallSubArraySum(arr));;
	}
	
	static int maximumNormalSubArraySum(int[] nums) {
		// Use Kaden's Algo
		//  	 8,-4,3,-5,4
		// -8,4,-3,5,-4
		int res = nums[0];
		int maxEnding = nums[0];
		
		for(int i = 1; i<nums.length;i++) {
			maxEnding = Math.max(nums[i], maxEnding+nums[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
	
	static int maximumOverallSubArraySum(int[] nums) {
			
		int minimumNormalSubArraySum = maximumNormalSubArraySum(nums);
		if(minimumNormalSubArraySum < 0) {
			return minimumNormalSubArraySum;
		}
		
		int overall_Sum = 0;
		
		for(int i =0; i<nums.length;i++) {
			overall_Sum += nums[i];
			nums[i] = -nums[i];
		}
		int max_Circular_Sum = overall_Sum+maximumNormalSubArraySum(nums);
		return Math.max(max_Circular_Sum, minimumNormalSubArraySum);
	}
	
	
}
