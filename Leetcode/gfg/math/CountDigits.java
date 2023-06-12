package com.gfg.math;

public class CountDigits {
	
	public static void main(String[] args) {
		
		System.out.println(countDigits(3458906));;
		
	}

	private static int countDigits(int n) {
		// TODO Auto-generated method stub
		
		//3456
		int count = 0;
		while(n > 0) {
			n = n/10;
			count++;
		}
		
		return count;
	}
}
