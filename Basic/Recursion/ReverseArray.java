public class ReverseArray{
	
	static int[] reverseArray(int[] arr){
		
		int low = 0;
		int high = arr.length-1;
		while(low < high){
			int temp = arr[low];	
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] ans = reverseArray(arr);
		
		for(int element : ans){
			System.out.println(element);
		}
	}
}