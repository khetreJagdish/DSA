public class OneOddOccuring{
	
	public static void main(String[] args){
		
		int[] a = {3,3,3,3,8,8,2,2,2,2,2,2};
		findOddOccuring(a);
		
	}
	
	static void findOddOccuring(int[] arr){
		
		int num = 0;
		for(int i = 0; i< arr.length;i++){
			
			int count = 0;
			for(int j = 0; j< arr.length; j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}
			
			if(count % 2 != 0){
					num = arr[i];
				}
			
		}
		
		System.out.println(num);
	
	}
}