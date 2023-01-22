public class KthBitSetOrNot{

	public static void main(String[] args){
	
		findKthBitSetOrNot(5,3);
	
	}
	
	static void findKthBitSetOrNot(int N, int k){
		
		if(((N >> (k-1)) &1) == 1){
			System.out.println("Kth bit is Set");
		}else{
			
			System.out.println("Kth bit is Not Set");
		}
		
	
	}
	
}