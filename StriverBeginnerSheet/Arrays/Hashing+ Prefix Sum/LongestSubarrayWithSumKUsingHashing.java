import java.util.*;
public class LongestSubarrayWithSumKUsingHashing {
    public static int longestSubarrayWithSumK(int []a, long k) {

        long sum = 0;
        int maxLen = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 0; i<N; i++){
			
            sum += A[i];
            // if any element from Array is equal to K 
			if(sum == K){
                maxLen = Math.max(maxLen,i+1);
            }
			
            long rem = sum - K;
            
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen ,i-map.get(rem));
            }
        map.putIfAbsent(sum,i);
        }
    return maxLen;
    
    }
}