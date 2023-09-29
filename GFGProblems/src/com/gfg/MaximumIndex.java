package com.gfg;

public class MaximumIndex {
	
	public static void main(String[] args) {
		int[] arr = {34,8,10,3,2,80,30,33,1};
		int val = maxIndexDiff(arr, 9);
		System.out.println(val);
	}
	
    static int maxIndexDiff(int A[], int N) { 
        
        // Your code here
        int i =0;
        int j = N-1;
        int max = Integer.MIN_VALUE;
        while(i<=j){
            if(A[i] <= A[j]){
                max = Math.max(max,j-i);
            }
            i++;
            j--;
        }
        return max;
    }
	
}
