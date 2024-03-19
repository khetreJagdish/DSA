public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

		int maxLen = 0;
		for(int i = 0; i<a.length; i++){
			long sum =0;
			for(int j = i; j<a.length; j++){
				sum += a[j];
				if(sum == k) maxLen = Math.max(maxLen,j-i+1);
			}
		}
	return maxLen;
    }
}