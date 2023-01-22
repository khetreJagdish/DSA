public class TwoOddOccuringNumber{
	
	public static void main(String[] args){
		
		int[] arr = {2,3,3,5,5,5,2,8,6,6};
		findOddOccuringNumber(arr);
		
	
	}
	
	static void findOddOccuringNumber(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			
			int count =0;
			for(int j = 0; j< arr.length; j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
				
			}
			
			if(count % 2 != 0){
				System.out.println(arr[i]);
			}
			
		}
		
	}
}