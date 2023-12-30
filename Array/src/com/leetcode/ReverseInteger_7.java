package com.leetcode;

public class ReverseInteger_7 {
	
	private static int reverse(int x) {
		
		long finalReverse = 0;
		
		while(x != 0) {
				int current  = x % 10;
				finalReverse = finalReverse * 10 + current;
				x = x /10;
		}
		
		if(finalReverse < Integer.MIN_VALUE || finalReverse > Integer.MAX_VALUE) {
			return 0;
		}
		
		if(x < 0) {
			return (int) (-1*finalReverse);
		}
		return (int)finalReverse;
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
