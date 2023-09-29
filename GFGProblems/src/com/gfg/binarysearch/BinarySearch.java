package com.gfg.binarysearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 4, 10, 40 };
		int result = binarySearch(arr, 10);
		System.out.println(result);
		
	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int low = 0; int high = arr.length-1;
		int middle = -1;
		while(low <= high) {
			
			middle = low + (high-low)/2;
			
			if(arr[middle] == key) {
				return middle;
			}else if(arr[middle] > key){
				high = middle-1;
			}else {
				low = middle+1;
			}
			
		}
		
		return middle;
		
	}
}
