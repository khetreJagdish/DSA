public class SmallestNumberInArray{
	
	public static void main(String ... args){
		
		int[] arr = {3,6,2,8,9,5,-3};
		
		int smallest = arr[0];
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i] < smallest){
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest Number :" + smallest);
		
	}
}