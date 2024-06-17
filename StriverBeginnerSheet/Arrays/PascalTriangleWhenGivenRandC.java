package com.takeuforward.array;

public class PascalTriangleWhenGivenRandC {
	
	public static long  printNcR(int n, int r) {
		long result = 1;
		
		for(int i =0; i<r; i++) {
			result = result *(n-i);
			result = result / (i+1);
		}
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(printNcR(10, 3));
		
	}
}
