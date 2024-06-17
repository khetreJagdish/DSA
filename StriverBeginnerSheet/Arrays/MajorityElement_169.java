// Use Boyer–Moore majority vote algorithm
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        
        int majorityElement  = -1;
        int count = 0;

        for(int i =0; i<nums.length; i++){
            if(count == 0){
                majorityElement = nums[i];
                count = 1;
            }else{
                if(nums[i] == majorityElement){
                    count++;
                }else{
                    count--;
                }
            }
        }
    return majorityElement;
    }
}