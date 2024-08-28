import java.util.* ;
import java.io.*; 
public class SelectionSort {
	
	/**
Algorithm :
	
Function selectionSort(arr, n):

    Loop i from 0 to n-2:
        Initialize min = i (assume the current index i has the minimum value).
        Loop j from i+1 to n-1:
            If arr[j] < arr[min], update min = j (find the index of the smallest element).
        Swap arr[i] with arr[min] (place the smallest element at the current position).

End Function.
	
	*/
	
	
	public static void selectionSort(int arr[], int n) {
		// Write your code here.

		for(int i = 0; i<n-1; i++){
			int min = i;
			for(int j=i+1; j<n; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}