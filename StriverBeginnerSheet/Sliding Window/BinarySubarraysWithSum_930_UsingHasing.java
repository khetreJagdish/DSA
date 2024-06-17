public class BinarySubarraysWithSum_930_UsingHasing {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;

        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            int rem = sum - goal;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    return count;
    }
}