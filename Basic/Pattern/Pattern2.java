package com.tuf.pattern;



public class Pattern2 {
	
	static void pattern2() {
		for(int i =1; i<=5;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* "+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		pattern2();
	}
}
