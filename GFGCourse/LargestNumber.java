import java.util.* ;
import java.io.*; 

public class LargestNumber {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
    
        if(n == 1){
            return arr[0];
        }
        int largestElement = arr[0];

        for(int i = 1; i<n;i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement; 
    }
}