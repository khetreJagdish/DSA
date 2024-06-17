public class FirstNegativeIntegerInEveryWindowOfSizeKBruteForce {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        
        long[] ans = new long[N-K+1];
		
        for(int i =0; i<= N-K; i++){
            for(int j = i; j<i+K; j++){
                if(A[j] < 0){
                    ans[i] = A[j];
                    break;
                }
            }
        }
    return ans;
        
    }
}