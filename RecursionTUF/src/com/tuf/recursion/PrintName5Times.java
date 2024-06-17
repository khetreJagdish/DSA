package com.tuf.recursion;

public class PrintName5Times {
	
	static int count = 0;
	static void printName() {
		
		if(count == 5) {
			return;
		}
		count++;
		System.out.println("Jagdish");
		printName();
	}
	
	public static void main(String[] args) {
		
		printName();
		
	}
	
}
