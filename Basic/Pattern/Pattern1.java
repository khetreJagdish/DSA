package com.tuf.pattern;



public class Pattern1 {
	
	static void pattern1() {
		for(int i =1; i<=5;i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* "+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		pattern1();
	}
}
