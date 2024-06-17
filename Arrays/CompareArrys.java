import java.util.ArrayList;

public class CompareArrys {

    public static void main(String[] args) {

        int array1[] = { 10, 20, 30, 40, 50 };
        int array2[] = { 9, 18, 27, 36, 45 };
        int array3[] = { 10, 20, 30, 40, 50 };
        int array4[] = array3;

    
        boolean isEquals = true;
        if (array1.length == array2.length) {

            for (int i = 0, j = 0; (i < array1.length & j < array2.length); i++, j++) {
                if(array1[i] != array2[j]) {
                    isEquals= false;
                }
            }
        }
        System.out.println("Both arrays are equals : " + isEquals);
    }
}
