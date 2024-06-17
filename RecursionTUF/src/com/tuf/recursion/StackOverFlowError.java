package com.tuf.recursion;

public class StackOverFlowError {
	static int count = 4;
	static void function1() {
		System.out.println(count);
		if(count == 0) {
			return;
		}
		count--;
		function1();
		
	}
	
	public static void main(String[] args) {
		function1();
	}
}
