public class  MajorityElementII_Brute_229 {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            int element = nums[i];
            int count =0;
            for(int j=i; j<nums.length; j++){
                if(nums[j] == element){
                    ++count;
                    if(count > nums.length/3 && !list.contains(nums[j])){
                        list.add(nums[j]);
                        break;
                    }
                }
            }
        }
    return list;
    }
}