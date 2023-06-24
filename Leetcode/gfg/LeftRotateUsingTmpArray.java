package com.gfg;

public class LeftRotateUsingTmpArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int [] ar = leftRotateUsingTmp(arr, 3);
		
		for(int i =0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

	public static int[] leftRotateUsingTmp(int[] arr, int d) {
		
		int[] temp =new int[d];
		// 1,2,3,4,5
		//3,4,5
		int arrlength = arr.length;
		for(int i =0; i<d; i++) {
			temp[i] = arr[i];
		}
		
		for(int i =d; i<arrlength; i++) {
			 arr[i-d]= arr[i];  //d =2 , i =, i=3
			                    //arr[0] = 3
		}                       //arr[] 
		
		for(int i =0;i<d;i++) {
			arr[arrlength-d+i]= temp[i];
		}
		
		return arr;
	}

}

