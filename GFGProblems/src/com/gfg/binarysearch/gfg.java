package com.gfg.binarysearch;

import java.io.IOException;

class gfg {
	public static void main(String args[]) throws IOException {
		// Your code here
		int arr[] = { 5, 10, 10, 15, 20, 20, 20 };
		int low = 0, high = arr.length - 1, X = 20;
		System.out.println(binarySearch(arr, low, high, X));
		;
	}

	private static int binarySearch(int arr[], int low, int high, int X) {

		if (low > high) {
			return -1;
		}

		int mid = low + ((high - low) / 2);

		if (X < arr[mid]) {
			return binarySearch(arr, low, mid - 1, X);
		} else if (X > arr[mid]) {
			return binarySearch(arr, mid + 1, high, X);
		} else {
			if (mid == 0 || arr[mid - 1] != arr[mid]) {
				return mid;
			} else {
				return binarySearch(arr, low, mid - 1, X);
			}
		}
		
	}
}
