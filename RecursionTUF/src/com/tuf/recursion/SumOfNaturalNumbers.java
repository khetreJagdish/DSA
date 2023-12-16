package com.tuf.recursion;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumbers(100));
	}
	
	static int sumOfNaturalNumbers(int n) {
		
		if(n == 0) {
			 return 0;
		}
		
		return n + sumOfNaturalNumbers(n-1);
		
	}
	
}
