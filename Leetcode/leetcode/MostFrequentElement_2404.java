package com.leetcode;

import java.util.Collection;
import java.util.HashMap;

public class MostFrequentElement_2404 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 2, 4, 4, 1 };
		System.out.println(mostFrequentEven(arr));
	}

	public static int mostFrequentEven(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				if (!map.containsKey(nums[i])) {
					map.put(nums[i], 1);
				} else {
					map.put(nums[i], map.get(nums[i])+ 1);
				}
			}
		}

		Collection<Integer> collections = map.values();

		System.out.println(collections);
		int min = Integer.MAX_VALUE;
		for (Integer i : collections) {
			if (i < min) {
				min = i;
			} else {
				min = -1;
			}
		}
		return min;
	}
}
