package com.gfg.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public static void mergeSort(int[] nums, int low, int high) {
		if(low == high) {
			return;
		}
		
		int mid = (low + high)/2;
		
		mergeSort(nums, low, mid);
		mergeSort(nums, mid+1,high);
		merge(nums,low,mid,high);
	}
	
	private static void merge(int[] nums, int low, int mid, int high) {
		int left = low;
		int right = mid+1;
		List<Integer> list = new ArrayList<Integer>();
		
		while(left <= mid && right <= high) {
			
			if(nums[left] <= nums[right]) {
				list.add(nums[left]);
				left++;
			}else {
				list.add(nums[right]);
				right++;
			}
		}
		
		while(left <= mid) {
			list.add(nums[left]);
			left++;
		}
		while(right <= high) {
			list.add(nums[right]);
			right++;
		}
		
		for(int i =low; i<=high;i++) {
			nums[i] = list.get(i-low);
		}
		
	}

	public static void main(String[] args) {
        int n = 6;
        int arr[] = { 2,0,2,1,1,0 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSort.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
		
	}

}
