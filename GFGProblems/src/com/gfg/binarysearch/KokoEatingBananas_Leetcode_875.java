package com.gfg.binarysearch;

/**
Intuition

The problem asks us to find the minimum eating speed that allows us to eat all the bananas within the given time limit. We can approach this problem using binary search.
Approach

Find the maximum pile size in the given piles array. We can initialize a variable max to the minimum possible 
integer value and iterate over all the piles to update the max value if we find a larger pile.

Initialize two variables low and high, where low is the minimum possible eating speed (1) and high is the maximum pile size.

Use binary search to find the minimum eating speed. While low is less than high, perform the following steps:

    Calculate the middle eating speed mid using start + (end - start) / 2

    Use the findMinimumHours function to calculate the total number of hours required to eat all the piles with the current eating speed mid. 
    The findMinimumHours function takes in the eating speed mid and the piles array as parameters. 
    Inside the function, iterate over all the piles and calculate the number of hours required by dividing each pile size 
    by the eating speed and rounding up using Math.ceil().
    Add each calculated hours value to a variable minHours.

    If the value of minHours is greater than the given time h, it means that the eating speed is too low and we need to increase it. Update low to mid + 1.

    If the value of minHours is less than or equal to h, it means that the eating speed is sufficient. In this case, update high to mid-1.

After the binary search loop terminates, return the value of low as the minimum eating speed that allows us to eat all the piles within h hours.
Complexity

    Time complexity:O(nlog(max−value−in−piles))O(nlog(max-value-in-piles))O(nlog(max−value−in−piles))

    Space complexity:O(1)O(1)O(1)

***/

class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        // Find max from piles
        int high = findMax(piles);
        int low = 1;

        while(low <= high){
            int mid = low + (high-low)/2;
            long minHours = findMinimumHours(piles,mid);
            if(minHours <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    long findMinimumHours(int[] piles, int mid){
        long targetMin = 0;
        for(int i =0; i<piles.length; i++){
            targetMin += (long)Math.ceil((double)piles[i]/mid);
        }
        return targetMin;
    }

    int findMax(int[] piles){
        int max = piles[0];
        for(int pile:piles){
            if(pile > max){
                  max = pile;
            }
        }
        return max;        
    }
}
