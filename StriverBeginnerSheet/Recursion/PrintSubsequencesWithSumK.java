package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequencesWithSumK {
	
	static void printSubsequencesWithSumK(int index, List<Integer> list,int sum,int k,int[] arr) {
		
		if(index == arr.length) {
			if(sum == k) {
				System.out.println(list);
			}
			return;
		}
		
		list.add(arr[index]);
		sum += arr[index];
		printSubsequencesWithSumK(index+1, list,sum,k, arr);
		sum -= arr[index];
		list.remove(list.size()-1);
		printSubsequencesWithSumK(index+1, list,sum,k, arr);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int sum =0;
		int k =2;
		printSubsequencesWithSumK(0, new ArrayList<Integer>(),sum,k, arr);
	}

}
