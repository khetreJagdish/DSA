package com.takeuforward.binarysearch;


//  O(Max(piles[]) * n) where n is piles array length 
public class KokoEatingBanana_BruteForce_Leetcode_875 {
		
	
	    public int minEatingSpeed(int[] piles, int h) {
	         
	        // Range of Eating Banans can be maximum the max(piles)
	        // so find the max from an piles Array 
	        int n = piles.length;
	         int max = findMax(piles);

	         // Range of Eating Banans can be maximum the max(piles) 
	         // so our range is from min = 1 and max = max(piles)

	         for(int i = 1; i<=max; i++){

	            int hoursCount = 0;

	            for(int j = 0; j<n; j++){
	                hoursCount += Math.ceil((double)piles[j]/(double)i);
	                if(hoursCount > h){
	                    break;
	                }
	            }

	            if(hoursCount <= h){
	                return i;
	            }

	         }
	    return max;
	    }

	    private int findMax(int[] piles){
	        int max = Integer.MIN_VALUE;

	        for(int i = 0; i<piles.length; i++){
	            max = Math.max(max,piles[i]);
	        }
	        return max;
	    }
	    
	    public static void main(String[] args) {
	    	KokoEatingBanana banana= new KokoEatingBanana();
	    	int[] piles = {30,11,23,4,20};
	    	System.out.println(banana.minEatingSpeed(piles, 6));;
		}
}
