package com.tuf.recursion;

public class NamePrinter{
	
	static void printName(int start, int end){
		
		if(start > end){
				return;
		}
		System.out.println("Jagdish");
		printName(start+1,end);
		System.out.println("Khetre");
	}
	
	public static void main(String[] args){
		printName(1,5);
	}
}