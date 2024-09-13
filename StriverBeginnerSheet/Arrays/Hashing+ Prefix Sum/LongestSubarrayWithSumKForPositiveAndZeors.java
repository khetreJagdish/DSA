
// Time complexity : O(2N)
// Space Complexity : O(1)

public class LongestSubarrayWithSumKForPositiveAndZeors {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

        int left = 0;
        int right = 0;
        long sum = 0L;
        int max = 0;

        while(right < a.length){
            sum += a[right];

            while(sum > k){
                sum -= a[left];
                left++;
            }

            if(sum == k){
                max = Math.max(max,right-left+1);
            }
        right++;
        }
    return max;

    }
}