package com.leetcode.array;

public class DeleteElementFromUnsoretedArray {
	
	public static void main(String[] args) {
		
		int arr[] = { 10, 50, 30, 40, 20, 50,20,10 };
		System.out.println("Before Element Delete");
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
		 deleteElement(arr,90);
		 
	}

	private static int deleteElement(int[] arr, int element) {
			
			int pos = findElement(arr,element);
			
			if(pos == -1) {
				System.out.println("Element Not found : "+ element );
				return arr.length;
			}
			
			for(int i = pos; i<arr.length-1; i++) {
				  arr[i] = arr[i+1];
			}
			
			System.out.println("After element delete");
			for(int i = 0; i<arr.length;i++) {
				System.out.print(arr[i] + " " );
			}
			
			return arr.length-1;
		
	}

	private static int findElement(int[] arr, int element) {
		
		for(int i = 0; i<arr.length; i++) {
				
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
