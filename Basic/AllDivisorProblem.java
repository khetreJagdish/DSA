public class AllDivisorProblem{
	
	public static void main(String[] args){
		
		printAllDivisorOfNumber(25);
	
	}
	
	static void printAllDivisorOfNumber(int number){
		
		
		
		for(int i = 1; i*i <= number; i++){
			
			if(number % i == 0){
				
				System.out.println(i);
				
				if(i != (number/i)){
						System.out.println(number/i);
				}
				
			}
			
		}
		
		
		
		
		
	}


}