package com.tuf.recursion;

public class NumberPrinterFromNTo1UsingBacktraking {
	
	public static void printNumberPrinterFromNTo1UsingBacktraking(int start,int end){
		
		if(start > end){
			return;
		}
		printNumberPrinterFromNTo1UsingBacktraking(start+1,end);
		System.out.println(start);
	}
	
	public static void main(String[] args){
		int start = 1;
		int end = 5;
		printNumberPrinterFromNTo1UsingBacktraking(start,end);
	}
}
