class CapacityToShipPackagesWithinDDays_Leetcode_1011_BruteForce {
    public int shipWithinDays(int[] weights, int days) {


        // find Max from weights [that is the minimum capacity we need to  ship all packages in a day]
       // find sum of all packages , that will be the maximum capacity of the ship
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<weights.length; i++){
            max = Math.max(max,weights[i]);
            sum += weights[i];
        }

        System.out.println(max);
        System.out.println(sum);

        for(int cap = max; cap<= sum; cap++){
            int numberOfDays = findNumberOfDays(cap, weights);

            if(numberOfDays <= days ){
                return cap;
            }
        }
    return -1;
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