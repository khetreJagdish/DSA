package com.gfg;

import java.util.ArrayList;
import java.util.List;

public class CountSetBitsForRange {
	
	public static void main(String[] args) {
		
		System.out.println(countSetBitForRange(5));
		
		
	}
/** 
 * x/2 = y
 * 
 * X - can be either Odd or Even
 * 
 * 1) When we have Odd Numbers then
 * 		No. of set Bits in x = 1 + No. of Set Bits in Y
 * 
 * 2) When we have Even Numbers then
 * 		No. of set Bits in x = No. of Set Bits in Y
 * 
 * 
 */
	
	private static List<Integer> countSetBitForRange(int num) {
		
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		
		resultArray.add(0);
		
		for (int x = 1; x <= num; ++x) {
			
			 resultArray.add(x/2 + x%2);
		}
		
		return resultArray;
		
	}
}
