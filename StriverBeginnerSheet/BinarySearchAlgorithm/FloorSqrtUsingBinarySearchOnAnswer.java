class FloorSqrtUsingBinarySearchOnAnswer {
    long floorSqrt(long n) {
        // Your code here
        
        long low = 1L;
        long high = n;
        
        long ans = 1L;
        
        while(low <= high){
            
            long mid = low + (high-low)/2;
            
            if(mid * mid <= n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    return ans;
    }
}