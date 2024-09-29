class SearchInRotatedSortedArray_II_Leetcode_81 {
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low <= high){

            // find out middle
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return true;
            }

            // In case of duplicate element on low , mid and high
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low+1;
                high = high -1;
                continue;
            }

            if(nums[low] <= nums[mid]){
                // that means left part is sorted , now check  if the target lies in this range or not
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }
    return false;       
    }
}