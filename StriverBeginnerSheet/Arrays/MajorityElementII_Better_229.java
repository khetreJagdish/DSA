public class MajorityElementII_Better_229 {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i]) > nums.length/3){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }
        }
    return list; 
    }
}