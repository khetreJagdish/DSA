class Solution_1480 {
    public int[] runningSum(int[] nums) {
        
        // [1,2,3,4]
        int[] summingArray = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            summingArray[i] = sum;
        }

        return summingArray;

    }
}