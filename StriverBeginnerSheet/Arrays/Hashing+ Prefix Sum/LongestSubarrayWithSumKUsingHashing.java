import java.util.*;
public class LongestSubarrayWithSumKUsingHashing {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
		int maxLen = 0;
		long prefixSum =0;
		HashMap<Long, Integer> prefixMap = new HashMap<>();
		for(int i = 0; i<a.length; i++){
			prefixSum += a[i];
			if(prefixSum == k) maxLen = Math.max(maxLen, i+1);
			long rem = prefixSum - k;
			if(prefixMap.containsKey(rem)) {
				 int len = i - prefixMap.get(rem);
				 maxLen = Math.max(maxLen, len);
			}
			if(!prefixMap.containsKey(prefixSum))
			prefixMap.put(prefixSum, i);
		}
	return maxLen;
    
    }
}