package com.gfg.array;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpaceCodingNinjas {
	public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int N = a.length;
        int M = b.length;

        int left = 0;
        int right =0;
        int index = 0;
        long[] arr = new long[N+M];

        while(left < N && right < M){

            if(a[left] <= b[right]){
                arr[index] = a[left];
                index++;
                left++;
            }else{
                arr[index] = b[right];
                index++;
                right++;
            }
        }

        while(left < N){
            arr[index++] = a[left++];
        }

        while(right < M){
            arr[index++] = b[right++];
        }
        
        System.out.println(Arrays.toString(arr));

        for(int i =0; i< N+M; i++){
            if(i < N) a[i] = arr[i];
            else b[i-N] = arr[i];
        }
    }
	
	public static void main(String[] args) {
		long[] arr1 = {1 ,8, 8};
		long[] arr2 = {2, 3, 4,5};
		mergeTwoSortedArraysWithoutExtraSpace(arr1, arr2);
	}
}
