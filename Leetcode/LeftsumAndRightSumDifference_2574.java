package com.leetcode;

public class LeftsumAndRightSumDifference_2574 {
	
	public static void main(String[] args) {
		int[] s = {10,4,8,3};
		int[] s1 =leftRightDifference(s);
				
	}
	
	public static int[] leftRightDifference(int[] nums) {
        
	int len = nums.length;
	
	int[] leftSum = new int[len];
	
	for (int i = 1; i < len; i++) {
		leftSum[i] = leftSum[i-1] + nums[i-1];
	}
	
	int[] rightSum = new int[len];
	
	for(int i = len-2; i >= 0; i--) {
		rightSum[i] = rightSum[i+1] + nums[i+1];
	}
	
	int[] ans = new int[len];
	
	for(int i = 0; i<len;i++) {
		ans[i] = leftSum[i] - rightSum[i];
	}
     return ans;   
    }
}
