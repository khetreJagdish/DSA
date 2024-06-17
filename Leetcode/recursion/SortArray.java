package com.recursion;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,4,2,1,3};
		int[] custom = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(custom));
		Arrays.sort(arr);
		
		
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for(int i = 0; i<arr.length; i++) {     //   1, 1, 4, 2, 1, 3
			for(int j =0; j<custom.length; j++) { // 1, 1, 1, 2, 3, 4
				if(arr[i] != custom[j] && i == j) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
