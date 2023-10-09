package com.gfg.binarysearch;

import java.util.*;

public class SearchInSortedRotatedArray_Leetcode_81 {
	public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {
		int n = arr.length; // size of the array.
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			// if mid points the target
			if (arr[mid] == k)
				return true;

			// Edge case:
			if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
				low = low + 1;
				high = high - 1;
				continue;
			}

			// if left part is sorted:
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= k && k <= arr[mid]) {
					// element exists:
					high = mid - 1;
				} else {
					// element does not exist:
					low = mid + 1;
				}
			} else { // if right part is sorted:
				if (arr[mid] <= k && k <= arr[high]) {
					// element exists:
					low = mid + 1;
				} else {
					// element does not exist:
					high = mid - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
		int k = 3;
		boolean ans = searchInARotatedSortedArrayII(arr, k);
		if (ans == false)
			System.out.println("Target is not present.");
		else
			System.out.println("Target is present in the array.");
	}
}
