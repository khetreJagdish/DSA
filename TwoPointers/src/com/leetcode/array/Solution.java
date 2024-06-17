package com.leetcode.array;
//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
        


// Solution class to implement function largestAndSecondLargest
class Solution1{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        // 2,1,2
        int max = -1;
        int secondMax = -1;
        
        for(int i = 0; i<sizeOfArray; i++){
            
            if(arr[i] > max){
                
                max = arr[i];
                secondMax = max;
            }
            
            if(arr[i] > secondMax && arr[i] < max){
                secondMax  = arr[i];
            }
            
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(max);
        list.add(secondMax);
        return list;
        
        
    }
}

//{ Driver Code Starts.

// Driver class
class Solution {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		int[] arr = {2,1,2};
		System.out.println(Solution1.largestAndSecondLargest(3, arr));
	}
}
// } Driver Code Ends