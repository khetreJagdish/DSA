package com.recursion;

public class RecursionDemo3 {
	
	public static void main(String[] args) {
		function(7);
	}
	
	
	static void function(int n) {
		
		if(n == 0) {
			return;
		}
		
		function(n/2);
		System.out.print(n%2);
	}
}
