public class TrappingRainWater_BruteForce_Leetcode_42
 {
    public int trap(int[] height) {
        
        // total quantity of water
        int quantityOfWater = 0;

        for(int i =0; i<height.length; i++){

            int leftMax = Integer.MIN_VALUE;
            int rightMax = Integer.MIN_VALUE;

            // calculate leftMax from i to 0
            for(int j = i; j >= 0; j--){
                leftMax = Math.max(leftMax,height[j]);
            }

            // calculate rightMax from i till end
            for(int k = i; k <height.length; k++){
                rightMax = Math.max(rightMax,height[k]);
            }

            // add each time into quantity
            quantityOfWater += Math.min(leftMax,rightMax) - height[i];

        }
        return quantityOfWater;
    }
}