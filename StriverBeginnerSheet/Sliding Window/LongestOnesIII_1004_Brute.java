
/**Brute Force Approach :
    1) start from 0 length window and expand till count of the zeroes in the window is less than or equal to given k
	2) and count maxlength only we zeroes count is less than or equal to k
	3) if count of zeroes is greater than k then just break the current window (inner loop) and start for next window i.e. outer loop
	4) finally retuen the maxLength
	
	Time Complexity : O(N^2)
		*/
public class LongestOnesIII_1004_Brute {
    public int longestOnes(int[] nums, int k) {

        int maxLength = 0;

        for(int i =0; i<nums.length; i++){
            int zeroCount = 0;
            for(int j =i; j<nums.length; j++){
                if(nums[j] == 0){
                    zeroCount++;
                }

                if(zeroCount <= k){
                    maxLength = Math.max(maxLength, j-i+1);
                }else{
                    break;
                }
            }
        }
    return maxLength;   
    }
}