
// Time Complexity : O(m*long(n))
public class FindNthRootOfM_UsingPowFunction
{
    public int NthRoot(int n, int m)
    {
        // code here
        for(int i =1; i<=m; i++){
            
            int multiplication =  (int)Math.pow(i,n);
			
			if(multiplication > m){
                return -1;
            }
            
            if(multiplication == m){
                return i;
            }
        }
    return -1;
    }
}