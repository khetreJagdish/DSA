package com.gfg;

public class KthBitSetOrNot {
	
	public static void main(String[] args) {
		
		findKthBitSetOrNot(39,5);
	}

	private static void findKthBitSetOrNot(int n, int k) {
		// TODO Auto-generated method stub
		
		//if(((n >> (k-1) & 1) == 1)) {
		  if(((n >> (k -1)) & 1) == 1){ 
			System.out.println("Kth bit is set");
		}else {
			System.out.println("Kth bit is not set");
		}
		
	}
}
