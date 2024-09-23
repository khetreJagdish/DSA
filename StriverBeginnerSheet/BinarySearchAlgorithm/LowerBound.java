
// Meaning of Lower Bound :  Smallest index from the Array 'arr[]' where arr[index] (i.e. element at given index) >= given x

// i.e. arr[index] >= x

public class LowerBound {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low = 0;
        int high = n-1;
        int ans = n;
        
        while (low <= high) {

            int mid = low + (high-low)/2;

            if(arr[mid] >= x){
                ans=mid;
                high = mid-1;
            }else{
                low = mid+1;
            }  
        }
        return ans;
    }
}