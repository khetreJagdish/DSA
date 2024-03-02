package com.tuf.recursion;

public class TowerOfHanoi {
	static void towerOfHanoi(int n, char source,
							char dest, char aux)
	{
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, source, aux, dest);
		System.out.println("Move disk " + n + " from rod "
						+ source + " to rod "
						+ dest);
		towerOfHanoi(n - 1, aux, dest, source);
	}

	// Driver code
	public static void main(String args[])
	{
		int N = 3;

		// A, B and C are names of rods
		towerOfHanoi(N, 'A', 'C', 'B');
	}
}