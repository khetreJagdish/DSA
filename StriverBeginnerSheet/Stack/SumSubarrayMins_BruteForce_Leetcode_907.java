public class SumSubarrayMins_BruteForce_Leetcode_907 {
    public int sumSubarrayMins(int[] arr) {
        
        int sum = 0;
        int MOD = 1000000007;
        for(int i =0; i<arr.length;i ++){

            int smallest = arr[i];

            for(int j = i; j<arr.length; j++){

                smallest = Math.min(smallest, arr[j]);
                sum = (sum + smallest)% MOD;
            }
        }
    return sum;
    }
	
}