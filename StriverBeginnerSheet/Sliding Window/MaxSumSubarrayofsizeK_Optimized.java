/**
The time complexity of the provided code is O(N), where N is the size of the input ArrayList Arr.

Explanation:

* The code iterates through the ArrayList Arr using two pointers start and end.
* At each step, it adds the element at the end pointer to the sum.
* If the size of the current subarray is less than K, it increments the end pointer to extend the subarray.
* If the size of the current subarray is equal to K, it updates the max sum, subtracts the element at the start pointer from the sum, and increments both start and end pointers to move to the next subarray.
* Since both pointers move at most N times, the overall time complexity is O(N).

**/


public class MaxSumSubarrayofsizeK_Optimized{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        // code here
        
        int start = 0;
        int end = 0;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        while(end < N){
            
            sum += Arr.get(end);
            
            if(end-start+1 < K){
                end++;
                
            }else if(end-start+1 == K){
                max = Math.max(max,sum);
                sum -= Arr.get(start);
                start++;
                end++;
            }
        }
    return max;
    }
}