package com.tuf.pattern;



public class Pattern3 {
	
	static void pattern3() {
		for(int i =1; i<=5;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		pattern3();
	}
}
