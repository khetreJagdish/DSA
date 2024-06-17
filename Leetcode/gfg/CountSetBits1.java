package com.gfg;

public class CountSetBits1 {
	public static void main(String[] args) {
		
		
		System.out.println(countSetBits(1099));
	}

	private static int countSetBits(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n > 0) {
			if(n % 2 != 0)
				count++;
			n = n/2;
		}
		return count;
	}
}
