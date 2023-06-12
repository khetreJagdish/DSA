package com.gfg;

public class PrimeFactorsEfficientSolution {
	
	public static void main(String[] args) {
		primeFactors(84);
	}
	
	
	static void primeFactors(int number) {
		
		if(number <= 1)
			return;
		
		for(int i = 2; i*i <= number; i++) {
			
			while(number % i == 0) {
				System.out.println(i);
				number = number / i;
			}
		}
		
		if(number > 1) {
			System.out.println(number);
		}
	} 
}
