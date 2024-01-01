package com.gfg.binarysearch;

/**
**Intitution :**
​
This is kind of increasing and decreasing line graph element.
 for e.g. [1,2,1,3,5,6,4]  
   first increasing from 1 to 2 then decreasing to 1 again increasing from 1 to 3 to 5 to 6 and then again decreasing to 4.
   
   so if we calculate the mid , we can say for sure is our peak element will be present after the mid element.
​
​
we have already given that : first element is always greater that it previous (i.e.   nums[0] > -∞ ) and last element is greater -∞ . so we just have to compare with nums[0]'s next element and nums[n-1]'s previous element as shown below.
     This we can handle as edge cases.
      `if(nums[0] > nums[1]) return 0;
       if(nums[n-1] > nums[n-2]) return n-1;`
***/



class FindPeakElement_162 {
    public int findPeakElement(int[] nums) {
    
    int n = nums.length;
    if(n == 1) return 0;
    if(nums[0] > nums[1]) return 0;
    if(nums[n-1] > nums[n-2]) return n-1;

    int low = 1;
    int high = n-2;

     while(low <= high){
	
	    int mid = low + (high-low)/2;
          
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }else if(nums[mid+1] > nums[mid]){
                low = mid+1; 
            }else{
                high = mid-1;
        }	
    }
    return -1;
   }
}


