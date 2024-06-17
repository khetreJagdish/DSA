package com.gfg;

public class MoveToZero {
	public static void main(String[] args) {
		
		int[] nums = {0,0,0,0,0};
		moveToZero(nums);
		
	}
	
	public static void moveToZero(int[] nums) {
		
		int count = 0;
		for(int i =0; i< nums.length; i++) {
			
			if(nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[count];
				nums[count] = temp;
				count++;
			}
			
		}
		if(count == 0) {
			System.out.println(0);
			return;
		}
		
		for(int i =0; i<nums.length; i++) {
			System.out.print(" "+ nums[i]);
		}
	}
	
}
