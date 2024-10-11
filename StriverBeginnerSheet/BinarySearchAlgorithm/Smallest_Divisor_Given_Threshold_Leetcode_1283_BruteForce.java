public class Smallest_Divisor_Given_Threshold_Leetcode_1283_BruteForce {
    public int smallestDivisor(int[] nums, int threshold) {
        
        
        int  max = findMax(nums); 

        for(int i = 1; i<=max; i++){
            boolean flag = checkIfDivisorIsSmallerThanThreashhold(nums, i,threshold );

            if(flag){
                return i;
            }
        }
    return -1;
    }

    private boolean checkIfDivisorIsSmallerThanThreashhold(int[] nums, int i, int threshold){

        int sum= 0;

        for(int j = 0; j<nums.length; j++){
            sum += Math.ceil((double)nums[j]/(double)i);
        }
        if(sum <=threshold ){
            return true;
        }
    return false;
    }

    private int findMax(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            max = Math.max(max,nums[i]);
        }
    return max;
    }
}