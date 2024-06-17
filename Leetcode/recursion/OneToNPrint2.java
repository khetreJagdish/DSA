package com.recursion;

public class OneToNPrint2 {
	
	public static void main(String[] args) {
		oneToNPrint(5);
	}
	
	
	static void oneToNPrint(int n) {
		
		if(n == 0) {
			return;
		}
		
		oneToNPrint(n-1);
		System.out.println(n);
	}
}
