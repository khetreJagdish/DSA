public class MoveZeroesToEnd {
        public static int[] moveZeros(int n, int []a) {
        
		

        int count = 0;

        for(int i = 0; i<n;i++){
            if(a[i] != 0){
                  a[count++] = a[i];                 
            }
        }


        for(;count<n;count++){
            a[count] =0;
        }

        return a;
    }
}