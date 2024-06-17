package com.gfg;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		int gcs = gcd(10, 15);
		System.out.println(gcs);
	}

	static int gcd(int a, int b) {
		
		int res = Math.min(a, b);
		
		
		while(res > 0) {
			
			if(a%res == 0  && b%res == 0 ) {
				
				break;
			}
			
			res--;
		}
		
		return res;
		
	}
	
	
}
