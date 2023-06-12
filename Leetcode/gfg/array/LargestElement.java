package com.gfg.array;

import java.util.Arrays;

public class LargestElement {
	
	public static void main(String[] args) {
		
		
		int[] arr = {3,8,12,5,6,30};
		
		int index = indexOfLargetstElement(arr);
		System.out.println(index);
	}

	private static int indexOfLargetstElement(int[] arr) {
		
		int maxElement = 0;
		
		
		int index = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > maxElement) {
				 maxElement = arr[i];
				 index = i;
			}
		}
		return index;
	}
}
