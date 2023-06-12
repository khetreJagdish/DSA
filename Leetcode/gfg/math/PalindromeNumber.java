package com.gfg.math;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		
		System.out.println(isNumberPalindrome(456542));;
		
	}

	private static boolean isNumberPalindrome(int n) {
		// TODO Auto-generated method stub
		
		int temp = n;
		//45654
		int reverse = 0;
		int lastDigit = 0;
		while(temp != 0) {
			
			lastDigit = temp % 10;
			reverse = reverse *10 + lastDigit ;
			temp = temp/10;
		}
		
		return (n == reverse);
		
	}
}
