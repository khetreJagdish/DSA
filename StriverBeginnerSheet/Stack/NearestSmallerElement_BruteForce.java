public class NearestSmallerElement_BruteForce {
    public int[] prevSmaller(int[] A) {
        
        int n = A.length;
        int[] G = new int[n];
        
        for(int i =0; i<n; i++){
            G[i] = -1;
            for(int j = i-1; j>=0 ; j--){
                if(A[j] < A[i]){
                    G[i]  = A[j];
                    break;
                }
            }
        }
    return G;
    }
}