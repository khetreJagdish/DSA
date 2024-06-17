public class MoveZeroesToEndOptimizedUsingSwap {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.

        int count = 0;

        for(int i = 0; i<n;i++){
            if(a[i] != 0){
                 int temp = a[i];
                 a[i] = a[count];
                 a[count++] = temp;
            }
        }

        return a;
    }
}