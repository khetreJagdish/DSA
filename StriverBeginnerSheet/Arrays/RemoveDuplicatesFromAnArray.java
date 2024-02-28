import java.util.ArrayList;

public class RemoveDuplicatesFromAnArray {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.

		int[] temp  = new int[n];

		temp[0] = arr.get(0);
		int count = 1;

		for(int i = 1; i<n;i++){
			if(!arr.get(i).equals(temp[count-1])){
				temp[count]=arr.get(i);
				count = count+1;
			}
		}

		for(int i =0; i<temp.length;i++){
			arr.set(i,temp[i]);
		}

		return count;
	}
}