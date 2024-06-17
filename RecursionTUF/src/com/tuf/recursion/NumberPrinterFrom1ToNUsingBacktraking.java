package com.tuf.recursion;

public class NumberPrinterFrom1ToNUsingBacktraking{
	
	static void printNumberFrom1toNUsingBacktraking(int start, int end){
		
		if(start < 1){
			return;
		}
		printNumberFrom1toNUsingBacktraking(start-1, end);
		System.out.println(start);
	}
	
	public static void main(String[] args){
		int start =5;
		int end = 5;
		printNumberFrom1toNUsingBacktraking(start,end);
	    	
	} 

}