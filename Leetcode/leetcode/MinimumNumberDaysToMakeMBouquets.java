class MinimumNumberDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        long product = (long)m*k;
        if(product > bloomDay.length) return -1;

        // find min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<bloomDay.length; i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }

        int low = min;
        int high = max;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(possible(bloomDay, mid, m, k)){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public boolean possible(int[] arr, int day, int m, int k){
        int flowerCount = 0;
        int booquetCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= day){
                flowerCount++;
            }else{
                booquetCount += (flowerCount/k);
                flowerCount = 0;
            }
        }
        booquetCount += (flowerCount/k);
        return booquetCount>=m;
    }
}
