package com.slidingwindow;

import java.util.Arrays;

// a[] = {10, -1, -5, 7, -15, 20, 18, 24}, k = 3

/*Problem statement
Given an array of integers a, and a positive integer k, find the first negative integer for each 
and every window (contiguous subarray) of size k. If a window does not contain a negative integer,
then print 0 for that window.*/

// Brute Force

public class FirstNegativeNumber {

	public static void main(String[] args) {
		int[] a = {10, -1, -5, 7, -15, 20, 18, 24};
		System.out.println(Arrays.toString(printFirstNegativeNumber(a, 3)));;
	}

	public static  int[] printFirstNegativeNumber(int[] nums, int k) {
		int n = nums.length;
		int[] negativeNumberArray = new int[n - k + 1];

		int idx = 0;

		for (int i = 0; i <= n - k; i++) {
			int negativeNumber = 0;
			for (int j = i; j < i + k; j++) {
				if (nums[j] < 0) {
					negativeNumber = nums[j];
					break;
				}
			}
			negativeNumberArray[idx++] = negativeNumber;
		}
		
		return negativeNumberArray;

	}

}
