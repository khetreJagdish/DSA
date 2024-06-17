package com.leetcode.array;

public class DeleteElementFromSortedArrayUsingBinarySearch {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,4,6,7,9};
		
		//deleteElement(nums,10);
		deleteElementUsingBinarySearch(nums, 10);
	}

	public static void deleteElement(int[] nums, int element){
		// 1. Search the element to be deleted (using Linear search)
		    int pos = searchElement(nums,element);
		   if(pos == -1) {
			   System.out.println("Element not found");
			   return;
		   }
		    for(int i = pos; i<nums.length-1; i++){
		        nums[i] = nums[i+1];
		    }
		   System.out.println();
		   for(int i = 0; i<nums.length-1; i++){
		       System.out.print(nums[i]+" ");
		   }
		}
		private static int searchElement(int[] nums, int element){
			for(int i = 0; i<nums.length; i++){
		           if(nums[i] == element){
		                return i;
		           }     
		     }
		   return -1; 
		} 
		
		public static void deleteElementUsingBinarySearch(int[] nums, int element){
			  
			   // search the element using binary search
			  int low = 0;
			  int  high = nums.length-1;
			  int  pos = binarySearch(nums, low,high,element);
			  
			  if(pos ==  -1){
			   return ; 
			 }

			 for(int i = pos; i<nums.length-1; i++){
			    nums[i] = nums[i+1];
			 }
			 
			 System.out.println();
			 for(int i = 0; i<nums.length-1; i++){
			   System.out.print(nums[i] + " ");
			 }

			}  
			  private static int binarySearch(int[] nums, int low, int high , int element){

			     int mid = (low + high)/2;
			     
			     if(nums[mid] == element){
			        return  mid;
			      }else if(element > nums[mid]){
			       return  binarySearch(nums,mid+1,high,element);
			        }else{
			        return  binarySearch(nums, low, mid-1, element);
			    }

			  }

	}


