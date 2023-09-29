package com.gfg;

import java.util.HashMap;
import java.util.Map;

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static int frequencyCount(int arr[], int N, int P)
    {
Map<Integer,Integer> map = new HashMap<>();
        
        
        for(int i =0; i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        int s = N/2;
        for(int i =0; i<N;i++){
            if(map.containsKey(i+1)){
            	if(map.get(i+1)>s) {
            		return map.get(i+1);
            	}
                arr[i] = map.get(i+1);
            }else{
                arr[i] = 0;
            }
        }
		return s;
    }
    
    public static void main(String[] args) {
		
    	int[] arr = {3,3,3,3};
    	int arr1 = frequencyCount(arr, 4, 3);
    	
    	System.out.println(arr1);
    	
	}
}
