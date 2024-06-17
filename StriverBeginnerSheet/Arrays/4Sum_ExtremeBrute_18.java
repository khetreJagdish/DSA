// Time Complexity : O(N^4)
//Space Complexity : O(number of quadruple)*2
public class 4Sum_ExtremeBrute_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                for(int k =j+1; k<n;k++){
                    
                    for(int l = k+1; l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                            List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(list);
                            set.add(list);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}