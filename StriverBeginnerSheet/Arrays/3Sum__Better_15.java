// Time COmplexity  : O(N^2)
// Space Complexity : O(N)
public class 3Sum__Better_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n =nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<n;i++){
            Set<Integer> temp = new HashSet<>();
            for(int j =i+1; j<n; j++){
				// as we know third element statement can be found like this nums[i] + nums[j] + nums[k] == 0  so jus take (nums[i] + nums[j]) on right side so that will become 
				// Negative (Simple Maths)
                    int third = - (nums[i] + nums[j]);
                    if(temp.contains(third)){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],third);
                        Collections.sort(list);
                        set.add(list);
                    }
                    temp.add(nums[j]);
            }
        }
    List<List<Integer>> listOfList = new ArrayList<>(set);
    return listOfList;
    }
}