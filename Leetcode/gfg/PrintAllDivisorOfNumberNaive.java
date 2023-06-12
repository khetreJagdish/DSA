package com.gfg;

public class PrintAllDivisorOfNumberNaive {
	
	public static void main(String[] args) {
		PrintAllDivisorOfNumberNaiveSolution(107);
	}
	
	static void PrintAllDivisorOfNumberNaiveSolution(int number) {
		
		for(int i =1; i<= number; i++) {
			if(number % i == 0) {
				System.out.println(i);
			}
		}
		
	} 
	
	
}
