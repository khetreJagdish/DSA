import java.util.Arrays;
public class AggressiveCows_BruteForce_CodingNinja {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        //    Write your code here.
    Arrays.sort(stalls);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for(int i = 0; i<stalls.length; i++){
        min = Math.min(min,stalls[i]);
        max = Math.max(max,stalls[i]);
    }
   // System.out.println("Min :"+min +" Max: "+max);
    for(int i = 1; i<= max; i++){
        if(canWePlace(stalls,i,k) == true){
            continue;
        }else{
            return i-1;
        }
    }
      return -1;
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