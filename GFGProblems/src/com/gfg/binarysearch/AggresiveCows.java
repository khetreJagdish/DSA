package com.gfg.binarysearch;

import java.io.*;
import java.util.*;
/**
Naive Approach: 

The extremely naive approach is to check all possible distances from 1 to max(stalls[])-min(stalls[]). The maximum distance for which the function canWePlace() returns true, will be our answer.
Algorithm:

    First, we will sort the given stalls[] array.
    We will use a loop(say i) to check all possible distances.
    Next, inside the loop, we will send each distance, i, to the function canWePlace() function to check if it is possible to place the cows.
        We will return (i-1), where i is the minimum distance for which the function canWePlace() returns false. Because (i-1) is the maximum distance for which we can place all the cows and for the distances >= i, it becomes impossible.
    Finally, if we are outside the loop, we can conclude the minimum possible distance should be max(stalls[])-min(stalls[]). And we will return this value.


**/



class AggresiveCows {
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] -stalls[0];
        
        while(low <= high){
            
            int mid = low + (high-low)/2;
            
            if (canPossible(stalls, mid, k) == true){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        
        return high;
        
    }
    
    public static boolean canPossible(int[] arr, int minDistance, int k) {

        int numOfCows = 1;
        int start = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - start >= minDistance) {
                numOfCows++;
                start = arr[i];
            }

            if (numOfCows >= k) {
                return true;
            } 
        }
        return false;
    }

}
