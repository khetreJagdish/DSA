public class LongestOnesIII_1004_MostOptimized {
    public int longestOnes(int[] nums, int k) {
        
        int left  =0;
        int right =0;
        int maxLength = 0;
        int length = nums.length;

        int zeroes = 0;

        while(right < length){

            // increase the number of zeroes count if found
            if(nums[right] == 0){
                zeroes++;
            }
            // if zeroes count exceding than k then move left to right and decrease zeroes count only if
            // we found zero
            if(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            // once we got the expected zeroes count then only update the maxLength otherwise do not update 
            // the maxLength if condition is not satisfying
            if(zeroes <= k){
                maxLength = Math.max(maxLength,right-left+1);
            }
        right++;
        }
    return maxLength;
    }
}