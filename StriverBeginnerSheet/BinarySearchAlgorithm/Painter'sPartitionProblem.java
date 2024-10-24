import java.util.ArrayList;

public class  Painter'sPartitionProblem 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        if(k > boards.size()) return -1;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for(int i=0; i<boards.size(); i++){
            max = Math.max(max,boards.get(i));
            sum += boards.get(i);
        }
    
        int low = max;
        int high =(int) sum;

        while(low <= high){
            int mid = low + (high-low)/2;
            int noOfPainters = numberOfPainters(boards,mid);

            if(noOfPainters <= k){
                high = mid-1;  
            }else{
                low = mid +1;      
            }
        }
    return low;
    }

    private static int numberOfPainters(ArrayList<Integer> boards, int unit){

        long unitSum = 0;
        int noOfPainters = 1;

        for(int i = 0; i<boards.size(); i++){
            long sum = boards.get(i) + unitSum;
            if( sum <=unit){
                unitSum += boards.get(i);
            }else{
                noOfPainters++;
                unitSum = boards.get(i);
            }
        }
        return noOfPainters;


    } 
}