package com.gfg.array;

public class DifferenceOfSUm {
	
	public static void main(String[] args) {
		
		int[] arr = {1,15,6,3};
		int a = differenceOfSum(arr);
		System.out.println(a);
			
	}
	
	public static int differenceOfSum(int[] nums) {
		int result = 0;
        for(int v : nums) {
        	result = result + v - (v / 1000 + v / 100 % 10 + v % 100 / 10 + v % 10);
        } 
        return Math.abs(result);
	}
}
