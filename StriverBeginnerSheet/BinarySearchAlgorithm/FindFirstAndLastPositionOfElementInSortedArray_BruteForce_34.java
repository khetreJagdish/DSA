
// Time Complexity O(2N)
public class FindFirstAndLastPositionOfElementInSortedArray_BruteForce_34 {
    public int[] searchRange(int[] nums, int target) {



        int[] pos = new int[]{-1,-1};

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                pos[0] = i;
                break;
            }
        }

        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] == target){
                pos[1] = i;
                break;
            }
        }
    return pos;
    }
}