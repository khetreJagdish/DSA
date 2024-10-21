import java.util.ArrayList;
public class AllocateBooks_BinarySearch {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<n; i++){
            max = Math.max(max,arr.get(i));
            sum = sum + arr.get(i);
        }

        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high-low)/2;
            int studentCount = findNumberOfStudents(arr,mid);

            if(studentCount > m){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

    return low;
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