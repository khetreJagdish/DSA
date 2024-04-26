public class 3Sum__Optimized_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Sort the Array as we have to apply the Two pointer Algorithm
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            // might happen that next ith element is duplicate i.e. next ith element should not be same as previous , if yes just skip the current element (so it will directly increase the i)
            // continue directly skip the current iteration
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k =n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    // we have got the ans and storing into ans list
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(list);
                    j++;
                    k--;
// we don't want to take duplicate elements if we have taken it earlier in the ans list so we will move to next element till we don't get the different element from earlier , that is why we are moving j and k till next different element but also need to make sure that j and k are not crossing each other i.e. j < k
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
    return ans;
    }
}