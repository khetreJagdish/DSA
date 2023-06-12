package com.gfg;

public class DigitsInFactorial {
	public static void main(String[] args) {

		Solution solution = new Solution();
		System.out.println(solution.digitsInFactorial(120));
		
	}
}

class Solution {
	public Long digitsInFactorial(long N) {
		// code here

		long fact = 1;
		if (N == 0) {
			return 1L;
		}

		for (long i = 2; i <= N; i++) {

			fact = fact * i;
		}

		long count = 0;
		while (fact > 0) {
			count++;
			fact = fact / 10;

		}

		return count;
	}
}
