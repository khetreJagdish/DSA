package com.tuf.recursion;

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		System.out.println(sumOfDigit(125));
		
	}
	
	static int sumOfDigit(int N) {
		
		if(N <= 0) {
			return 0;
		}
		
		return (N%10) + sumOfDigit(N/10);
		
	}
}
