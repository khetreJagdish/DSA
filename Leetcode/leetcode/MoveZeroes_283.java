package com.leetcode;

import java.util.Arrays;

public class MoveZeroes_283 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		System.out.println("Before Move : " + Arrays.toString(arr));
		int[] arr2 = moveZeroes(arr);
		System.out.println("After move : " + Arrays.toString(arr2));
	}

	public static int[] moveZeroes(int[] arr) {
		
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != 0) {
			int tmp = arr[i];
			arr[i] = arr[count];
			arr[count] = tmp;
			count++;
		  }
		}
		return arr;
	}
}
