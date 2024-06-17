package com.gfg.array;

public class InsertElement {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// {1,2,3,_,_}
		insert(arr, 3, 5, 2, 8 );
				
		
	}

	private static int insert(int[] arr, int length, int capacity, int atPosition, int element) {
		
		int idx = atPosition-1;
		// {1,2,3,_,_}
		if(length == capacity) {
			return length;
		}
		//          2         2 >= 4   
		for(int i = length-1; i >= idx ; i--) {
			arr[i+1] = arr[i];
		}
		arr[idx] = element;
		return length+1;
		
	}
}
