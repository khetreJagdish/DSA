package com.gfg.sorting;

import java.util.Arrays;
import java.util.Comparator;

// Comparator to have even number first before odd
class CustomEvenSorting implements Comparator<Integer>{
	
	public int compare(Integer o1, Integer o2) {
		
		return o1%2 - o2%2;
	}
}

public class SortArrayByEvenNumber {
	
	public static void main(String[] args) {
		Integer[] arr = {3,5,7,1,9,4,2};
		Arrays.sort(arr,new CustomEvenSorting());
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
