package com.tuf.recursion;

public class PrintGFG {
	
	static void func1(int n) {
		
		if(n ==0) {
			return ;
		}
		func1(n-1);
		System.out.println("GFG");
	}
	
	public static void main(String[] args) {
		
		func1(2);
		
	}
}
