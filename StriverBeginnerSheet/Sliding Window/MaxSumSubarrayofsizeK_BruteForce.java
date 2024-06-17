// Time Complexity : O(N^2)
public class MaxSumSubarrayofsizeK_BruteForce{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=N-K; i++){
                
            int sum = 0;
            
            for(int j =i; j<i+K; j++){
                  sum += Arr.get(j);
            }
            
            max = Math.max(max,sum);
        }
    return max;
    }
}