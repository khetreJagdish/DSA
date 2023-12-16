package com.tuf.recursion;

public class PrintFrom1ToNNumber {
	
	public static void main(String[] args) {
		printFrom1ToN(10);
	}
	
	static void printFrom1ToN(int N) {
		
		if(N == 0) {
			return;
		}
		
		System.out.println(N);
		printFrom1ToN(N-1);
		
	}
}
