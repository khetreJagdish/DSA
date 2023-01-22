public class FactorialOfNumberUsingRecursion{

	public static void main(String[] args){
		
		System.out.println(factorialOfNumber(10));//35352  False
		
	}
	
	static int factorialOfNumber(int number){
		
		if(number == 0)
				return 1;
			
		return number*factorialOfNumber(number-1);
		
	}
	
}