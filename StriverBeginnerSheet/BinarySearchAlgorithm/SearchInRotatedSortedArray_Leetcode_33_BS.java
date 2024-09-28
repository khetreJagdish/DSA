class SearchInRotatedSortedArray_Leetcode_33_BS {
    public int search(int[] nums, int target) {

        // first step : initialize low  = 0 and high = nums.length-1;
        int low = 0;
        int high = nums.length-1;

        // regular BS pattern using while loop

        while(low <= high){

            // first calculate mid and check if mid is equal to the target if yes then return mid index

            int mid  = low + (high-low)/2;
            if(nums[mid] == target) return mid;

            //check if left array is sorted 
            if(nums[low] <= nums[mid]){ // if true then left array is sorted
                
                // check if target element is lies in this left array
                if(nums[low] <= target && target <= nums[mid]){ // if true then lies in left array , so eliminate right half
                    high = mid -1;
                }else{
                    // that means target is not in left half so eliminate left half
                    low = mid + 1;
                }
            }else{ // that means right array is sorted

                //check if target element lies in right half
                if(nums[mid] <= target && target <= nums[high]){ // if true then target lies in right array , so eliminate left half
                    low = mid+1;
                }else{
                    // else eliminate the right half
                    high = mid-1;
                }
            }
        }

    return -1;    
    }
}