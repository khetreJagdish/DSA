package com.leetcode;

public class RotateArray_189 {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2};
		int[] ar = rotate(arr, 3);
	}
	
	public static int[] rotate(int[] nums, int k) {

        k = k%nums.length;
        // nums[] = {1,2,3,4,5,6,7};  // {1,2}
        rightRotate(nums,0,nums.length-1);  // {7,6,5,4,3,2,1}  // {2,1}
        rightRotate(nums,0,k-1);            //{5,6,7,4,3,2,1}   // 
        rightRotate(nums,k,nums.length-1);  //{5,6,7,1,2,3,4}
		return nums;
        
    }

    public static void rightRotate(int[] nums, int start, int end){
        
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
       
    }
}
