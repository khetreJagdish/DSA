package com.gfg;

public class PrimeFactorsMoreEfficientSolution {
	
	public static void main(String[] args) {
		primeFactors(17);
	}
	
	static void primeFactors(int number) {
		
		if(number <= 1)
			return;
		
		while(number % 2==0) {
			System.out.println(2);
			number = number /2;
		}
		
		while(number % 3==0) {
			System.out.println(3);
			number = number /3;
		}
		
		for(int i = 5; i*i <= number; i= i+6) {
			
			while(number % i == 0) {
				System.out.println(i);
				number = number /i;
			}
			
			while(number % (i+2) == 0) {
				System.out.println(i+2);
				number = number /(i+2);
			}
		}
		
		if(number > 3) {
			System.out.println(number);
		}
		
	} 
}
