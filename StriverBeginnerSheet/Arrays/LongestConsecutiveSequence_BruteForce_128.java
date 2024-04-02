// Time complexity : ~O(n^2)
// Space Complexity : O(1)
public class LongestConsecutiveSequence_BruteForce_128 {
    public int longestConsecutive(int[] nums) {
        
        int longest = 0;
        for(int i =0; i<nums.length; i++){
            int x = nums[i];
            int count = 1;

            while(linearSearch(nums,x+1)){
                count++;
                x = x+1;
            }

            longest = Math.max(longest,count);
        }
    return longest;
    }

    public boolean linearSearch(int[] nums,int number){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == number){
                return true;
            }
        }
        return false;
    }
}