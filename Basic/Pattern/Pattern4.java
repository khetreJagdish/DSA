package com.tuf.pattern;



public class Pattern4 {
	
	static void pattern4() {
		for(int i =1; i<=5;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		pattern4();
	}
}
