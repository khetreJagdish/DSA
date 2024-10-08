class MinimumNumberDaysMakeBouquets_Optimized_Leetcode_1482 {
    // 
    public int minDays(int[] bloomDay, int m, int k) {
        
        int n = bloomDay.length;
        long result =(long) m * k;
        
        if(result > n) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]); 
        }

        while(low <= high){
        int mid = low + (high-low)/2;
        if(isPossible(bloomDay,mid, m,k)){
            high = mid-1;
        }else{
            low = mid+1;
        }
      }        
    return low;
    }

    private boolean isPossible(int[] bloomDay, int day, int m, int k){
        int count = 0;
        int numberOfBooquets = 0;
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                numberOfBooquets += (count/k);
                count=0;
            }
        }
        numberOfBooquets += (count/k);
    return numberOfBooquets >= m;
    }
}