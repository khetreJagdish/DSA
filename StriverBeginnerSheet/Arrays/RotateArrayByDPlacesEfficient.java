import java.util.ArrayList;

public class RotateArrayByDPlacesEfficient {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k%n;
        rotateAnArryByK(0,n-1,arr);
        rotateAnArryByK(0,n-k-1,arr);
        rotateAnArryByK(n-k,n-1,arr);

        return arr;
    }

    private static void rotateAnArryByK(int start, int end , ArrayList<Integer> list){

        while(start < end){

            int temp = list.get(end);
            list.set(end, list.get(start));
            list.set(start, temp);
            start++;
            end--;
        }

    }
}