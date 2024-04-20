package com.recursion;

import java.util.ArrayList;
import java.util.List;

// Print only Single subsequence with Sum == K
public class PrintSingleSubsequencesWithSumK {
	static boolean flag = false;
	static boolean printSingleSubsequencesWithSumK(int index, List<Integer> list,int sum,int k,int[] arr) {
		
		if(index == arr.length) {
			if(sum == k) {
				// set flag to true and this will execute only once
				flag = true;
				System.out.println(list);
			}
			return flag;
		}
		
		list.add(arr[index]);
		sum += arr[index];
		// if below call return true after this other recursive calls will not execute
		// directly return true to every previous call as we want only single count
		if(printSingleSubsequencesWithSumK(index+1, list,sum,k, arr) == true) {
			return true;
		}
		sum -= arr[index];
		list.remove(list.size()-1);
		// if below call return true after this other recursive calls will not execute
		// directly return true to every previous call as we want only single count
		if(printSingleSubsequencesWithSumK(index+1, list,sum,k, arr) == true) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int sum =0;
		int k =2;
		printSingleSubsequencesWithSumK(0, new ArrayList<Integer>(),sum,k, arr);
	}

}
