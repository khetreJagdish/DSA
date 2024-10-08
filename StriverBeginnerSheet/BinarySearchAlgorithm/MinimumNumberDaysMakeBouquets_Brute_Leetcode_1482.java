class MinimumNumberDaysMakeBouquets_Brute_Leetcode_1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int[] minMax = findMinAndMax(bloomDay);
        int min = minMax[0];
        int max = minMax[1];
    for(int day = min; day<= max; day++){

        if(isPossible(bloomDay,day, m,k)){
            return day;
        }
    }
    return -1;
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
        if(numberOfBooquets >= m){
            return true;
        }
    return false;
    }

    private int[] findMinAndMax(int[] bloomDay){
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<bloomDay.length; i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]); 
        }
    return new int[]{min,max};
    }
}