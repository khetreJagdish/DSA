class SplitArrayLargestSum_Leetcode_410_BinarySearch {
    public int splitArray(int[] nums, int k) {

        if(k > nums.length) return -1;        

        int max = Integer.MIN_VALUE;
        long sum = 0L;

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        

        long low = max;
        long high = sum; 

        while(low <= high){
            long mid = low + (high-low)/2;
            int splitCount =  numberOfArrays(mid, nums);

           if(splitCount > k){
                low = mid+1;
           }else{
            high = mid-1;
           }
        }

    return (int)low;
    }

    private int numberOfArrays(long maxSum, int[] nums){

        int arrayCount = 1;
        int sum = 0;

        for(int i = 0; i<nums.length; i++){

            if(nums[i] + sum <= maxSum){
                sum += nums[i];
            }else{
                arrayCount++;
                sum = nums[i];
            }
        }
    return arrayCount;
    }
}