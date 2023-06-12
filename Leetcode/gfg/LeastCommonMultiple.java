package com.gfg;

public class LeastCommonMultiple {
	
	public static void main(String[] args) {
		
		System.out.println(lcd(4, 6));
	}
	
	static int lcd(int a, int b) {
		
		int res = Math.max(a, b);
		
		while (true) {
			//6 % 4
			if(res % a == 0 && res % b == 0) {
				return res;
			}
			
			res++;
		}
		
	}
	
}
