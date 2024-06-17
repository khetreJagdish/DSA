package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
	
	static void printSubSwquence(int index, List<Integer> list,int[] arr) {
		
		if(index == arr.length) {
			System.out.println(list);
			return;
		}
		
		list.add(arr[index]);
		printSubSwquence(index+1, list, arr);
		list.remove(list.size()-1);
		printSubSwquence(index+1, list, arr);
	}

}
