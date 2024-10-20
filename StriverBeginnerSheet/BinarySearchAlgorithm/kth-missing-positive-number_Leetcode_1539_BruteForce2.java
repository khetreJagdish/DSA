class kth-missing-positive-number_Leetcode_1539_BruteForce2 {
    public int findKthPositive(int[] arr, int k) {
        
        for(int i : arr){
            if(i <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}