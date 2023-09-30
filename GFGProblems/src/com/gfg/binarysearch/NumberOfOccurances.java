package com.gfg.binarysearch;

class NumberOfOccurances {
	/**
	 *  Find the number od Occurences in an sorted Array
	 * @param arr : Array in which we want to search
	 * @param n : array length
	 * @param x :Element we want to search
	 * @return count of element occured in an Array ,
	 *     if element not present in Array , return 0
	 *     
	 *     
	 *     Approach : same as finding leftmost index and rightmost index problem.
	 *     1) Find the leftmost index of an element (set -1 as default leftmost index value)
	 *            if we found the the index then find for rightmost index
	 *           -  if we did not find the leftmost index then element is not present in an 
	 *            array and return 0 directly.
	 *            - if we found the leftmost index (i.e. if leftmost != -1) then find rightmost index
	 *            and finally 
	 *                        return rightmostindex - leftmostindex +1;
	 *      
	 */
	
	
	static int count(int[] arr, int n, int x) {
        // code here
		//1, 1, 2, 2, 2, 2, 3
        int low = 0;
        int high = n-1;
        int mid = 0;
        int leftOccurence = -1;
        int rightOccurence = -1;
        //Find the leftmost index of an element (set -1 as default leftmost index value)
        while(low <= high){
             mid = low + ((high - low)/2);
            
            if(arr[mid] == x){
                 leftOccurence = mid;
                high = mid-1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        //if we did not find the leftmost index then element is not present in an 
   	   //           array and return 0 directly.
        if(leftOccurence == -1){
            return 0;
        }
        
        low = 0;
        high = n-1;
        
        // if we found the  leftmost index then find for rightmost index
        while(low <= high){
            
         mid = low + ((high - low)/2);
            
            if(arr[mid] == x){
                rightOccurence = mid;
                low = mid+1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return rightOccurence - leftOccurence +1;
       
        
    }

	public static void main(String[] args) {
		int Arr[] = { 1, 1, 2, 2, 2, 2, 3 };
		int N = 7;
		int X = 4;
		int count = count(Arr, N, X);
		System.out.println(count);
	}
}