package com.tuf.recursion;

public class FibonaciiSeries {
	// What is Fibonacii series :
	// Addition of previous two number to get the next number
	//e.g. 0 ,1 ,1, 2, 3, 5, 8, 13, 21, 34... so on
		
	public static void main(String[] args) {
		int number = 5;
		int ans = fibo(number);
		System.out.println(ans);
	}
	
	public static int fibo(int number) {
		
		if(number <=1) {
			return number;
		}
		
		return fibo(number-1) + fibo(number-2);
	}
	
	
}
