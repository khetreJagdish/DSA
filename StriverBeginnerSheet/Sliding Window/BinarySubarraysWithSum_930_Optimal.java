public class BinarySubarraysWithSum_930_Optimal {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int left = 0;
        int right = 0;
        int prefixSum = 0;
        int totalCount = 0;
        int zeroesCount = 0;
        while(right < nums.length){
            prefixSum += nums[right];
            // check 2 conditions here
            // 1) if left pointer <  right
            // 2) count number of prefix zeroes in subarray and add those prefix count of zeroes
            // in totalCount    
            while(left < right && (nums[left] == 0 || prefixSum > goal) ){
                
                if(nums[left] == 0){
                    zeroesCount++;
                }else{
                    zeroesCount = 0;
                }
                prefixSum -= nums[left];
                left++;
            }

            if(prefixSum == goal){
                totalCount += 1 + zeroesCount;
            }
        right++;
        }
    return totalCount;
    }
}