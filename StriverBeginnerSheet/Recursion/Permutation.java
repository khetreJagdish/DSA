package com.tuf.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurrPermute(nums,ds,ans,freq);
        return ans;
    }

    private static  void recurrPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans,boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i =0; i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurrPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
        
    }
    public static void main(String[] args) {
    	int[] arr = {1,2,3};
		List<List<Integer>> permutation = permute(arr);
		for(List<Integer> listOfInt : permutation) {
			for(int s :listOfInt) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}