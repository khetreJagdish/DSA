package com.recursion;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		
		System.out.println(sumOf(50));
	}
	
	static int sumOf(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n + sumOf(n-1);
	}
}

