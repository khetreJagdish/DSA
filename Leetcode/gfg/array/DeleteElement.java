package com.gfg.array;

public class DeleteElement {
	
	public static void main(String[] args) {
		
		int[] arr = {3,8,12,5,6};
		
		int a = deleteElement(arr, 5,12);
		
		
			System.out.print(" "+a);
		
	}

	private static int deleteElement(int[] array, int size, int element) {
		// TODO Auto-generated method stub
		
		// Step 1: find the element to delete
		int i;
		for(i = 0; i< size; i++) {
			if(array[i] == element) {
				break;
			}
		}
		
		if(i == size)
			return array.length;
		
		//3,8,5,6,_
		// i = 2 hence j =2
		 //          2 ;   4;
		for(int j = i ; j < size-1; j++) {
			array[j] = array[j+1];
		}
		
		return array.length-1;
		
	}
}
