package com.gfg;

public class FirstSetBit {
	
	public static void main(String[] args) {
		
		System.out.println(findFirstSetBit(4));//1
	}

	private static int findFirstSetBit(int n) {
		// TODO Auto-generated method stub
		
		int  res = 0;
		while(n > 0) {
			
			if((n & 1) ==1) {
				res++;
				break;
			}else {
				
				n = n >> 1;
				res++;
			}
			
		}
		
		
		return res;
	}
}
