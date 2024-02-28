
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        boolean isSwapped = false;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(isSwapped == false){
            break;
            }
        }

        
    }

}