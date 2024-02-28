import java.util.ArrayList;

public class LeftRotateByDPlace {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        
        int[] temp = new int[k];
        for(int i = 0; i<k; i++){
            temp[i] = arr.get(i);
        }

        int count = 0;

        for(int i=k; i<n;i++){
             arr.set(count, arr.get(i));
             count++;
        }

        for(int i = 0; i<k; i++){
            arr.set(count, temp[i]);
            count++;
        }

        return arr;
    }
}