class SplitArrayLargestSum_Leetcode_410_BruteForce {
    public int splitArray(int[] nums, int k) {

        if(k > nums.length) return -1;        

        int max = Integer.MIN_VALUE;
        long sum = 0L;

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        for(int i = max; i<= sum; i++){
           int splitCount =  numberOfArrays(i, nums);

           if(splitCount <= k){
                return i;
           }
        }
    return -1;
    }

    private int numberOfArrays(int maxSum, int[] nums){

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