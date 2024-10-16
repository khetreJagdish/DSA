class CapacityToShipPackagesWithinDDays_Leetcode_1011_Optimized {
    public int shipWithinDays(int[] weights, int days) {


        // find Max from weights [that is the minimum capacity we need to  ship all packages in a day]
       // find sum of all packages , that will be the maximum capacity of the ship
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<weights.length; i++){
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }

       

        

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high-low)/2;
            int numberOfDays = findNumberOfDays(mid, weights);

            if(numberOfDays <= days ){
                high= mid-1;
            }else{
                low = mid+1;
            }
        }

    return low;
    }

    private int findNumberOfDays(int cap, int[] weights){
        int load = 0;
        int days = 1;

        for(int i = 0; i<weights.length; i++){

            if(load + weights[i] > cap){
                days =  days+1;
                load = weights[i];
            }else{
                load = load + weights[i];
            }
        }
    return days;       
    }
}