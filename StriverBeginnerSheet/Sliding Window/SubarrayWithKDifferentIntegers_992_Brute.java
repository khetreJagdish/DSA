import java.util.HashSet;
public class SubarrayWithKDifferentIntegers_992_Brute {
    public static int kDistinctSubarrays(int[] arr, int n, int k) {
        // Write your code here.
         int count =0;
        for(int i =0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();

            for(int j =i; j<n; j++){
                set.add(arr[j]);

                if(set.size() == k){
                    count++;
                }

                if(set.size() > k){
                    break;
                }
            }
        }
    return count;
     
    }
}