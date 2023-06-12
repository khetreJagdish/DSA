package com.gfg;

public class PrimeFactorsNaiveSolution {

	public static void main(String[] args) {
		primeFactors(1031);
	}

	static void primeFactors(int number) {

		for (int i = 2; i < number; i++) {

			if (isPrime(i)) {
				int x = i;
				while (number % x == 0) {
					System.out.println(i);
					x = x * i;
				}

			}

		}
	}

	private static boolean isPrime(int num) {

		if (num == 2 || num == 3) {
			return true;
		}

		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i <= num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}
