package com.recursion;
public class ReverseArrayUsingRecursion {
    // Reverse Array Using Recursion
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return reverseArrayRecursively(nums,0,n-1);
    }

    static int[] reverseArrayRecursively(int[] nums, int low, int high){

        if(low > high){
            return nums;
        }
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        return reverseArrayRecursively(nums,++low,--high);
    }
}