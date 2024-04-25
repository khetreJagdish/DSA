package com.twopointer;

import java.util.Arrays;

public class RemoveElement_Optimal_27 {
    public static int removeElement(int[] nums, int val) {

        int i =0;

        for(int j =0; j<nums.length; j++){
            if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                System.out.println(Arrays.toString(nums));
            }
        }
    return i;
        
    }
    public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,0,4,2};
		//System.out.println(Arrays.toString(arr));
    	int ans = removeElement(arr, 2);
    	//System.out.println(Arrays.toString(arr));
    	System.out.println(ans);
	}
}