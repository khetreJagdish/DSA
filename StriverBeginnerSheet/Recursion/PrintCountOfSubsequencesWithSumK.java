package com.recursion;

// Print Number of (count) subsequence with Sum == K
public class PrintCountOfSubsequencesWithSumK {
	
	// if condition gets matched , return 1 and if condition is not matched return 0
	// and lastly just add l + r
	static int printCountOfSubsequencesWithSumK(int index, int sum,int k,int[] arr) {
		if(sum > k) return 0;  // there will be of no use of further calls if sum is excedding (but only in case of Array having positive only)
		if(index == arr.length) {
			if(sum == k) {
				return 1;
			}
			return 0;
		}
		
		sum += arr[index];
		int l = printCountOfSubsequencesWithSumK(index+1,sum,k, arr);
		sum -= arr[index];
		int r = printCountOfSubsequencesWithSumK(index+1,sum,k, arr);
		return l+r;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int sum =0;
		int k =2;
		System.out.println(printCountOfSubsequencesWithSumK(0,sum,k, arr));
	}

}
