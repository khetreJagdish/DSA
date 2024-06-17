package com.gfg.array;

public class SearchElement {
	
	public static void main(String[] args) {
		
		int[] arr  = {20,5,7,25,15};
		
		System.out.println(search(arr));;
		
	}

	private static int search(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == 35) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
		
	}
}
