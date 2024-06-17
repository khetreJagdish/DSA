public class LeftRotateByOnePlace {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.

        if(n == 1){
            return arr;
        }

        int temp = arr[0];

        for(int i = 1; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]= temp;

    return arr;
    }
}