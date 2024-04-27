import java.util.*;
public class 4Sum_Brute_18 {
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                Set<Integer> temp = new HashSet<>();
                for(int k =j+1; k<n;k++){
                    int remainingEle = target - (nums[i] + nums[j]+nums[k]);
                    if(temp.contains(remainingEle)){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],remainingEle);
                        Collections.sort(list);
                        set.add(list);
                    }
                    temp.add(nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}