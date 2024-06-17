package com.bitmanipulation;

// Time complexity : O(logn)
// Space Complexity : O(logn) : because we are storing bit in String as many number of steps we performed
public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		System.out.println(convertDecimalToBinary(1398));
	}

	public static String convertDecimalToBinary(int n) {

		String s = "";
		while (n != 0) {
			if (n % 2 == 1) {
				s = s.concat("1");
			}else {
				s = s.concat("0");
			}
			n = n / 2;
		}
		StringBuilder builder = new StringBuilder(s);
		return builder.reverse().toString();
	}
}
