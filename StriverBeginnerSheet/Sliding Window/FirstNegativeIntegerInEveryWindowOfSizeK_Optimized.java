package com.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// Problem Link : https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeIntegerInEveryWindowOfSizeK_Optimized {

	public static List<Long> printFirstNegativeInteger(long A[], int N, int K) {
		// Queue to keep track of first negative element
		Queue<Long> queue = new LinkedList<>();
		
		//List : this is will be our Ans list
		List<Long> list = new ArrayList<>();
		long i = 0, j = 0;
		//traverse till j is less than array length		
		while (j < N) {
			// only add negative elements in queue because those only required [based on questions]
			if (A[(int) j] < 0){
				queue.add(A[(int) j]);
			}
			
			// traverse till window size is equal to K
			if (j - i + 1 < K) {
				j++;
			} else {
				// whe we enter into else , that means window size became == k  
				
				// but check if queue is empty , if yes the just add 0 in Ans list [requirement given in Problem statement to add 0 if there are no negative in window of size k]
				if (queue.isEmpty()) {
					list.add(0L);
				} else {
					//now always pick the top element from queue which will be the first negative from K window size
					// and add that in Ans list.
					list.add(queue.peek());
					
					//Before moving the window , first we need to remove the first element from previous window 
					// so check if the current windows first element is present in the queue , if yes just remove it from queue
					if (queue.peek() == A[(int) i])
						queue.poll();
				}
				// lastly just move the window using i++ and j++
				i++;
				j++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		long[] a = { 12, -1, -7, 8, -15, 30, 16, 28 };
		List<Long> list = printFirstNegativeInteger(a, a.length, 3);

		for (long l : list) {
			System.out.print(l + " ");
		}
	}
}
