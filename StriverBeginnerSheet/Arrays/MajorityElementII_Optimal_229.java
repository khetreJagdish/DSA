public class MajorityElementII_Optimal_229 {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int element1 = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>(2);
        int count2 = 0;
        int element2 = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){

            if(count1 == 0 && nums[i] != element2){
                count1 = 1;
                element1 = nums[i];
            }else if(count2 == 0 && nums[i] != element1){
                count2 = 1;
                element2 = nums[i];
            }else if(element1 == nums[i]){
                count1++;
            }else if(element2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

         count1 = 0;
         count2 = 0;

         for(int i =0; i<nums.length; i++){
            if(nums[i] == element1){
                count1++;
            }
            if(nums[i] == element2){
                count2++;
            }
         }

         if(count1 > (nums.length/3)){list.add(element1);}
         if(count2 > (nums.length/3)){list.add(element2);};

    return list;
        
    }
}