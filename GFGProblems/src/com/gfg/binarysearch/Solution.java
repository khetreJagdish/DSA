package com.gfg.binarysearch;
class Solution {
    public static int searchInsert(int[] nums, int target) {
        
        for(int i =0; i<nums.length;i++){
            if(nums[i] == target) {
                return i;
            }

            if(nums[i] > target) {
                return i;
            }
        } 

        return -1; 
    }
    
    public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int t = 2;
		int ans = searchInsert(arr, t);
		System.out.println(ans);
	}
}