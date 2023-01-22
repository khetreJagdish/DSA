public class FindOddOccuringOptimized{
	
	public static void main(String[] args){
		
		int[] a = {4,4,2,2,5,2,5,5,5};
		int num = findOneOddOccuringOptimized(a);
		System.out.println(num);
	}
	
	static int findOneOddOccuringOptimized(int[] a){
		
		int result = 0;
		for(int i = 0; i< a.length;i++){
			
			result = result ^ a[i];
			
		}
		return result;
		
		
		
	}
}