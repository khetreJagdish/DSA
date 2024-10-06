class FindNthRootOfM_UsingBinarySearch
{
    public int NthRoot(int n, int m)
    {
        // code here
        int low  = 1;
        int high = m;
        
        while(low <= high){
            
            int mid = low+(high-low)/2;
            
            int multiply = (int)Math.pow(mid,n);
            
            if(multiply == m){
                return mid;
            }
            
            if(multiply > m){
                high = mid-1;
            }else{
                low = mid +1;
            }
            
        }
        return -1;
    }
}