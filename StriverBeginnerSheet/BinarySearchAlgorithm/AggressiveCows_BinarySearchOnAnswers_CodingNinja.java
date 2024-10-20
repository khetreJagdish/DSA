import java.util.Arrays;
public class AggressiveCows_BinarySearchOnAnswers_CodingNinja {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
    Arrays.sort(stalls);
    int max = Integer.MIN_VALUE;

    for(int i = 0; i<stalls.length; i++){
        max = Math.max(max,stalls[i]);
    }

    int low = 1;
    int high = max;

    while(low <= high){
        int mid = low + (high-low)/2;
        if(canWePlace(stalls,mid,k) == true){
            low = mid+1;
        }else{
            high = mid -1;
        }
    }  
    return high;
    }

    static boolean canWePlace(int[] stalls , int minDistance, int cowsToBePlaces){
    int cowsCount = 1;
    int start = stalls[0];

    for(int i = 1; i<stalls.length; i++){

        if(stalls[i] - start >= minDistance){
            cowsCount++;
            start = stalls[i];
        }

        if(cowsCount >= cowsToBePlaces){
            return true;
        }
    }
    return false;
  }
}