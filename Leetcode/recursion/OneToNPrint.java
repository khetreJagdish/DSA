package com.recursion;

public class OneToNPrint {
	
	public static void main(String[] args) {
		oneToNPrint(5);
	}
	
	
	static void oneToNPrint(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		oneToNPrint(n-1);
	}
}
