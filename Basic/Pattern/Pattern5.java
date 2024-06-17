package com.tuf.pattern;

public class Pattern5 {
	

	
	static void pattern5() {
		for(int i =1; i<=5;i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* "+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		pattern5();
	}

}
