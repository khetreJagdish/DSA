public class MoveZeroesToEndUnsingExtraSpace {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.

        int[] temp = new int[n];

        int count = 0;

        for(int i = 0; i<n;i++){
            if(a[i] != 0){
                temp[count] = a[i];
                count++;
            }
        }

        return temp;
    }
}