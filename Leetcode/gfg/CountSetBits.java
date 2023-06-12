package com.gfg;

public class CountSetBits {
	
	public static void main(String[] args) {
		
		System.out.println(countSetBit(4));
	}
	
	
	static int countSetBit(int n){
		
		StringBuilder builder = new StringBuilder(Integer.toBinaryString(n));
		
		char[] ch = builder.toString().toCharArray();
		
		int count = 0;
		for(int i =0; i<ch.length; i++) {
			if(ch[i] == '1')
				count++;
		}
		return count;
		
		
		
	}
}
