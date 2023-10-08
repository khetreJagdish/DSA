package com.gfg.binarysearch;

public class SearchInSortedRotatedArray_Leetcode_33 {
	/**
	 * Approach : 
	 * The main idea is that we need to find some parts of array that we could adopt binary search on that, which means we need to find some completed sorted parts, then determine whether target is in left part or right part. There is at least one segment (left part or right part) is monotonically increasing.


*     If the entire left part is monotonically increasing, which means the pivot point is on the right part
        If left <= target <= mid ------> drop the right half
        Else ------> drop the left half
*     If the entire right part is monotonically increasing, which means the pivot point is on the left part
        If mid < target <= right ------> drop the left half
        Else ------> drop the right half
	 * 
	 * 
	 * @param nums --> Input sorted rotated Array
	 * @param target  --> Element which we want to find
	 * @return index of element if present else -1
	 */
	
	
	public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low <= high){

            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

    return -1;
    }
}
