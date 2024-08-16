public class NextGreaterElement_II_BruteForce {
    // Refer Striver's sheet for better understanding
    public int[] nextGreaterElements(int[] nums) {
        int N = nums.length;
        int[] ans= new int[N];
        Arrays.fill(ans,-1);
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<=i+N-1; j++){
                int index = j % N;

                if(nums[index] > nums[i]){
                    ans[i] = nums[index];
                    break;
                }
            }
        }
    return ans;
    }
}