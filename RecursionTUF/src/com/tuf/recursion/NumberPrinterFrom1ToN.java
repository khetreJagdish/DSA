package com.tuf.recursion;

public class NumberPrinterFrom1ToN{
	
	static void printNumberFrom1ToN(int start, int end){
		
		if(start > end){
			return;
		}
		System.out.println(start);
		printNumberFrom1ToN(start+1,end);
	}
	
	public static void main(String[] args){
		int start =1;
		int end = 5;
		printNumberFrom1ToN(start,end);
	}
}