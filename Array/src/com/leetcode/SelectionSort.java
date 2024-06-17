package com.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        //Your code goes here
    	int n = arr.length;
        for(int i =0; i<n;i++){
            int minElement = arr[i];
            int element = i;
            for(int j = i; j<n; j++){
                if(minElement > arr[j]){
                    minElement = arr[j];
                    element = j;
                }
            }
            swap(arr,i,element);
        }
		return arr;

    }

    static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
    public static void main(String[] args) {
    	int[] arr= {2, 13, 4, 1, 3, 6,6, 28};
    	
    	System.out.println(Arrays.toString(selectionSort(arr)));
	}
}
