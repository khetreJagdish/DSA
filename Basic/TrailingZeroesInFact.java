public class TrailingZeroesInFact{

	public static void main(String[] args){
		
		System.out.println(trailingZeroesInFact(100));
	
	}
	
	static int trailingZeroesInFact(int number){
		
		int result = 0;
		
		for(int i = 5; i<= number; i= i*5){
			
			result = result + number/i;
		}
		
		return result;
	}
}