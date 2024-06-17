package com.gfg;

public class TimeComplexity {
	
	public static void main(String[] args) {
		
		int n =5;
		int i,j,k,count = 0;
		for(i = n/2;i<=n;i++) {
			for (j = 1; j+n/2 <= n; j++) {
				for (k = 1; k <= n; k=k*2) {
					count++;
				}
			}
		}
		
	}
}
