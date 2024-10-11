class Smallest_Divisor_Given_Threshold_Leetcode_1283_Optimized {
    public int smallestDivisor(int[] nums, int threshold) {
       
       int max= Arrays.stream(nums).max().getAsInt();
       int low = 1;
       int high = max;
       while(low <= high){
           int mid = low + (high-low)/2;
           if(possible(nums,mid,threshold)){
               
               high = mid-1;
           }else{
               low = mid+1;
           }
       }
       return low;
    }

    public boolean possible(int[] nums, int element, int threshold){

        double sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += (double)Math.ceil((double)nums[i]/element);
        }
      return (sum <= threshold);
    }
}