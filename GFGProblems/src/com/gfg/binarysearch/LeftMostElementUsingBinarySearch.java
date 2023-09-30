package com.gfg.binarysearch;

import java.io.IOException;

class LeftMostElementUsingBinarySearch {
	public static void main(String args[]) throws IOException {
		// Your code here
		int arr[] = { 5, 10, 10, 15, 20, 20, 20 };
		int low = 0, high = arr.length - 1, X = 20;
		System.out.println(binarySearch(arr, low, high, X));
		;
	}

	private static int binarySearch(int arr[], int low, int high, int X) {

		/**
		 * Find leftmost index using Binary Search iterative approach:
		 * 
		 * Logic : 1) if our low beomes greater than high then we element is not found
		 *                and we return -1 
		 *             2) first calculate the mid using formula : int mid = low +
		 *                  ((high-low)/2) 
		 * 1st case : 3) if element from mid index is greater then target element then
		 *                   we will just change high = mid -1 i.e. we will search in the left side of mid
		 *                  index. 
		 * 2nd case :
		 *              4) if element from mid index is less than the target element
		 *                 then we will just change the low = mid +1 i.e. we will shift search space to
		 *                right of mid index. 3rd case : 
		 * 3rd case:               
		 *               5) if target is same as mid index element then store that index in 
		 *                one variable and again shift search space to left side of mid index
		 *                because we want to check first occurance of element.
		 *                
		 *                6) if we did not find the element then return -1
		 */
		int res = -1;

		while (low <= high) {
			
			int mid = low + ((high - low) / 2);

			if (X == arr[mid]) {
				res = mid;
				high = mid - 1;
			} else if (X > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return res;
	}
}
