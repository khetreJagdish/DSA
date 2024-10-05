public class FloorSqrt {
    long floorSqrt(long n) {
        // Your code here
        
        long ans = 1L;
        
        for(long i = 1; i<=n; i++){
            if(i * i <= n){
                ans = i;
            }else{
                break;
            }
        }
    return ans;
    }
}