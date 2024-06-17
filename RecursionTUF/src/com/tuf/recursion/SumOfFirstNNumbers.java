package com.tuf.recursion;

public class SumOfFirstNNumbers {
	
	static int sumOfFirstNNumbers(int N){
		
		if(N ==  0) {
			return 0 ;
		}
		
		return N + sumOfFirstNNumbers(N-1);
	}
	
	public static void main(String[] args) {
		int sum = sumOfFirstNNumbers(3);
		System.out.println(sum);
	}
}
