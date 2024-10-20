class kth-missing-positive-number_Leetcode_1539_BruteForce1 {
    public int findKthPositive(int[] arr, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        int j = 1;
        int count = 0;
        while(j > 0){
            if(!set.contains(j)){
                count++;
                if(count == k){
                    return j;
                }
            }
        j++;
        }
    return -1;
    }
}