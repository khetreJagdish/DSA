package com.gfg;

public class LeftRotateAnArrayByD {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int position = 1;
		int[] arr2 = null;
		for(int i = 0; i< position;i++) {
			arr2 = leftByDPosition(arr);
		}
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

public static int[] leftByDPosition(int[] arr) {
		
	int tmp = arr[0];
	
	for(int i = 1; i<arr.length; i++) {
		 arr[i-1] = arr[i];
	}
	
	 arr[arr.length-1]= tmp;
	 
	 return arr;
 }
}
