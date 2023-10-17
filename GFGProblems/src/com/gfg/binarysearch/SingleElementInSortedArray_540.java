/**
# Intitution : 
###### if you obesrve an Array carefully All pairs before sigle element (i.e. left elements of Single element) is in (even, odd ) position and all elements which are on right side of an Single element are in (odd,even) position so using this approach . 

1) First we handle the edge cases: 
* 		check if array length is equal to 1 then return that single element.
* 		check if it's a first element then check if it's next element is not equal , if this is true then return first element.
* 		check if it's last element is not equal to it's second last element , if this returns true then return last element.

2) Under while loop:
* 			As we have handleed the first and last element od an array , we don't need to check for same.
* 			so we will initialize **low** variable as = 1 and **high** variable as = n-2 (where n is the size of an array)
	* 			inside while calculate middle
  *       1) check if mid's next element and mid's last element are not equal , if this returns true then this is our sigle Element and return the same. 
  *       i.e.  `if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
 		      return nums[mid];
        `
  *       2) but if above returns false then we will check if mid is at odd index i.e. (mid % 2 == 1) and mid element's previous element is same as mid element then we are on the left side  **or** if we are at even index and next element is equal to mid element  then also we are at left side so eliminate this left side and move to right, because our element should be on the right side.
		*       i.e. 
		`else if( (mid % 2 == 1 && nums[mid-1] == nums[mid]) || (mid %2 == 0 && nums[mid] ==nums[mid+1])){
             low = mid+1;
        }`
				
		      3) else we are on the right side so elimanate right side .
      * 		     i.e. `else{
        high = mid-1;
      }
`
***/


class SingleElementInSortedArray_540 {
    public int singleNonDuplicate(int[] nums) {
       
        int n = nums.length;
	    if(nums.length == 1) return nums[0];  
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        
        int low = 1;
        int high = n-2;

    while(low <= high){
	
	    int mid = low + (high-low)/2;
           
	    if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
 		      return nums[mid];
        }else if( (mid % 2 == 1 && nums[mid-1] == nums[mid]) || (mid %2 == 0 && nums[mid] ==nums[mid+1])){
             low = mid+1;
        }else{
        high = mid-1;
    }
  }

return -1;

    }
}
