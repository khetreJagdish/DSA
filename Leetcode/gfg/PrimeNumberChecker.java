package com.gfg;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		System.out.println(isPrime(1031));
	}
	
	
	static boolean isPrime(int number) {
		
		if(number == 1) {
			return false;
		}
		
		for (int i = 2; i*i <= number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
		
		
		
		
		
	}
}
