package com.tuf.recursion;

public class NumberPrinterFromNto1{
	
	static void printNumberFromNto1(int start, int end){
		
		if(start < end){
			return;
		}
		System.out.println(start); //5,4,3,2,1
		printNumberFromNto1(start-1,end);
	}
	
	public static void main(String[] args){
		int start =5;
		int end = 1;
		printNumberFromNto1(start,end);
	}
}