package com.gfg;

public class LeftRotateAnArrayByOne {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int d = 3;
		int[] nums1 = null;
		for(int i =0; i<d; i++) {
			nums1 = rotateArray(nums);
		}
		
		for(int i = 0; i< nums1.length; i++) {
			System.out.print(" "+ nums1[i]);
		}
		
	}
	
	public static int[] rotateArray(int[] nums) {
		int count = 0;
		int temp = nums[0];
		for(int i = 1; i< nums.length; i++) {
			nums[count] = nums[i];
			count++;
		}
		
		nums[count] = temp;
		return nums;
	}
}
