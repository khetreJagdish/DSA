
// Time complexity : O(N)
// Space Complexity : O(N)
public class SubarrayWithKDifferentIntegers_992_Optimized {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return subArraysWithAtMostK(nums,k)-subArraysWithAtMostK(nums,k-1);
    }

    public int subArraysWithAtMostK(int[] nums, int k){
        int left =0;
        int right =0;
        int count =0;
        HashMap<Integer,Integer> map =new HashMap<>();
        while(right < nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
                while(map.size() >k){
                    map.put(nums[left],map.get(nums[left])-1);
                    if(map.get(nums[left]) == 0){
                        map.remove(nums[left]);
                    }
                    left++;
                }
            count += (right-left+1);
            right++;
        }
    return count;
    }
}