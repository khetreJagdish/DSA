package com.gfg;

public class PrimeNumberCheckerTCN {

	public static void main(String[] args) {
		System.out.println(isPrime(25));
	}

	static boolean isPrime(int number) { // time Complexity : O(n-2) i.e. O(n)

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false;
			}

		}

		return true;

	}
}
