import java.util.ArrayList;
public class AllocateBooks_BruteForce {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i<n; i++){
            max = Math.max(max,arr.get(i));
            sum = sum + arr.get(i);
        }

        for(int i = max; i<=sum; i++){
            int studentCount = findNumberOfStudents(arr,i);

            if(studentCount == m){
                return i;
            }
        }
    return max;
    }

    static int findNumberOfStudents(ArrayList<Integer> arr, int maxPages){
        int studentCount = 1;
        int noOfPages = 0;

        for(int i = 0; i<arr.size(); i++){

            if(noOfPages + arr.get(i) <= maxPages){
                noOfPages += arr.get(i);
            }else{
                studentCount++;
                noOfPages = arr.get(i);
            }
        }
    return studentCount;
    }
}