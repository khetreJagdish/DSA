package com.tuf.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode_78_SubSet {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> listOfList = new ArrayList<>();

		subSetFun(nums, 0, new ArrayList<>(), listOfList);
		return listOfList;

	}

	public static void subSetFun(int[] nums, int index, List<Integer> ls, List<List<Integer>> listOfList) {

		if (index == nums.length) {
			listOfList.add(new ArrayList<>(ls));
			return;
		}

		ls.add(nums[index]);
		subSetFun(nums, index + 1, ls, listOfList);
		ls.remove(ls.size() - 1);
		subSetFun(nums, index + 1, ls, listOfList);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>>  listOfList =  subsets(arr);
		for(List<Integer> list : listOfList) {
			System.out.print(list.toString()+" ");
		}
	}

}