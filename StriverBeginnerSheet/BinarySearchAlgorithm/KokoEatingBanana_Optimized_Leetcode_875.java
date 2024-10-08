/*




*/



class KokoEatingBanana_Optimized_Leetcode_875 {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = findMax(piles);
        
        while(low <= high){

            int mid = low + (high-low)/2;
            int totalHours = findPossibleHours(piles,mid);

            if(totalHours <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
    return low;
    }

    private int findPossibleHours(int[] piles, int mid){
        int totalHours = 0;
        for(int i = 0; i<piles.length; i++){
           totalHours +=  Math.ceil((double)piles[i]/(double)mid);
        }
    return totalHours;
    }

    private int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i = 0; i<n; i++){
            max = Math.max(max,piles[i]);
        }
    return max;
    }
}