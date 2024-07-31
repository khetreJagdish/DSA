public class NextGreaterElementII_Optimized_Leetcode_503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int N = nums.length;
		// we will hypothetically double the Array as this is requirement is on Circular Array
        for(int i = 2*N-1; i>= 0 ;i--){

            while(!stack.isEmpty() && stack.peek() <= nums[i%N]){
                stack.pop();
            }
	
            if(i < N){
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[i%N]);
        }
        return ans;
    }
}