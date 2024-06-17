package com.gfg.array;

public class ArrayIsSortedOrNot {
	
	public static void main(String[] args) {
		
		int[] arr= {10,15,17,17,30,0};
		 System.out.println(isArraySorted(arr));
		
	}
	
	public static boolean isArraySorted(int[] arr) {
		//5,,7,30
		for(int i= 1; i< arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				return false;
			}
		}
		return true;
	}
}
