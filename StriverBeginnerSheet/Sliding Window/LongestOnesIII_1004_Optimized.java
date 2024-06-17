public class LongestOnesIII_1004_Optimized {
    public int longestOnes(int[] nums, int k) {
        
        int maxLength = 0;
        int zeroes = 0;
        int left = 0;
        int right = 0;
        int length = nums.length;

        // run from right to the length of the array
        while(right < length){

            //if zero found , increase the count of zero
            if(nums[right] == 0){
                zeroes++;
            }

            // if size of zero is excedding the value of k then try to trim it down from left pointer 
            while(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }

            // if value is within the required k value then count the maxlength
            if(zeroes <= k){
                maxLength = Math.max(maxLength,right-left+1);
            }
        // then increase the window size
        right++;
        }
    return maxLength;
    }
}