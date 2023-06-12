package com.gfg;

public class KthBitSetOrNotByLeftShift {
	
	public static void main(String[] args) {
		kthBitSetOrNot(500,3);
	}

	private static void kthBitSetOrNot(int n, int k) {
		// TODO Auto-generated method stub
		
		if((n & (1<<(k-1))) != 0) {
			System.out.println("Kth bit set");
		}else {
			System.out.println("Kth bit not set");
		}
		
	}
}
