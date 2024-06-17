public class  LongestSubarrayWithZeroSum {

    // Brute Force
    
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int maxLen = 0;
        for(int i =0; i<arr.length;i++){
            long sum = 0;
            // Generate all the SubArray
            for(int j =i; j<arr.length; j++){
                sum += arr[j];
                // check only those  SubArray whose Sum = 0
                if(sum == 0){
                    // if Sum = 0 then update the length of SubArray
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
    return maxLen;
    }
}