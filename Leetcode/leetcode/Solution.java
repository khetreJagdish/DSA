package com.leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        Long max = 0l;
        int start = 0, end =0;
        int size = nums.length;
        Long sum = 0l;
        Set<Integer> set = new HashSet<>();

        while(end < size){
            
            int val = nums[end];

            while(set.contains(val) || (end-start+1 > k) && start < end ){
                sum -= nums[start];
                set.remove(nums[start++]);
            }
            
            sum += val;
            set.add(val);

            if(end-start+1 == k){
                max = Math.max(sum,max);
            }
            end++;
        }

    return max;

    }
    
    public static void main(String[] args) {
		int[] arr= {1,5,4,2,9,9,9};
		Solution s = new Solution();
		Long max =s.maximumSubarraySum(arr, 3);
		System.out.println(max);
	}
}