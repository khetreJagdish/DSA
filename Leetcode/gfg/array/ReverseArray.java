package com.gfg.array;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr= {10,5,7,30};
		int low = 0, high = arr.length-1;
		
		
		
		while(low < high) {
			int tmp = arr[high];
			arr[high] = arr[low];
			arr[low] = tmp;
			low++;
			high--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
