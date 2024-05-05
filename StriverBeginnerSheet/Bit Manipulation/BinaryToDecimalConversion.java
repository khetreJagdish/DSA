package com.bitmanipulation;

public class BinaryToDecimalConversion {
	
	public static void main(String[] args) {
		System.out.println(binaryToDecimalCOnveraion("10101110110"));
	}
	
	public static int binaryToDecimalCOnveraion(String binaryString) {
		
		int length = binaryString.length();
		int decimal = 0;
		for(int i =0; i<length;i++) {
			int digit = binaryString.charAt(i)-'0';
			decimal = (int)((int)decimal + digit * Math.pow(2, length-1-i));
		}
	return decimal;
	}
}
