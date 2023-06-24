package com.gfg.array;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		int[] arr = {5,20,12,20,10};
		int num = secondLargestElement(arr);
		System.out.println(num);
	}

	private static int secondLargestElement(int[] arr) {
		// TODO Auto-generated method stub
		
		int index = firstLargestElement(arr);
		int result = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != arr[index]) {
				if(result == -1) {
					result = i;
				}else if(arr[i] > arr[result]){
					result=i;
				}
			}
		}
		
		return result;
	}
	private static int firstLargestElement(int[] arr) {
		
		int target = 0;
		
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] > arr[target]) {
				target = i;
			}
		}
		return target;
	}
}
