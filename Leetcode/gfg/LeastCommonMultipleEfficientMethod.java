package com.gfg;

public class LeastCommonMultipleEfficientMethod {

	public static void main(String[] args) {
		System.out.println(lcd(4, 6));
	}

	static int lcd(int a, int b) {

		int res = Math.max(a, b);

		int lcd = (a * b) / gcd(a, b);

		return lcd;
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			return a;
		}

		return gcd(b, (a % b));
	}

}
