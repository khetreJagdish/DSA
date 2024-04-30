public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        // List of List for storing Ans Lists
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combinationSumFunction(0,target,candidates,ds,ans);
        return ans;
    }

    public void combinationSumFunction(int index,int target,int[] candidates,List<Integer>ds,List<List<Integer>> ans){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<Integer>(ds));
            }
            return;
        }

        if(candidates[index] <= target ){
            ds.add(candidates[index]);
            combinationSumFunction(index,target-candidates[index],candidates,ds,ans); // take
            ds.remove(ds.size()-1);
        }
        combinationSumFunction(index+1,target,candidates,ds,ans); // not take
    }
}