/**
Optimal approach (Using hashmap):
If we can find any two subarray of prefix sum having same mod value (or remainder), then their difference must be divisible by k.
So we can use a map to store mod value (or remainder) of each prefix sum in map, with its index.
Then check if map contains the same mod value (remainder) with index difference >= 2 when we have new mod value with each iteration.

**/

public class ContinuousSubarraySum_523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int sum = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum % k;

            if(hashMap.containsKey(remainder)){
                if(i-hashMap.get(remainder) >= 2){
                    return true;
                }
            }else{
                hashMap.put(remainder,i);
            } 
        }
        return false; 
    }
}