public class FactorialOfNumber{

	public static void main(String[] args){
		
		System.out.println(factorialOfNumber(10));//35352  False
		
	}
	
	static int factorialOfNumber(int number){
		
		int fact = 1;
		
		for(int i = 2; i<= number;i++){
			fact = fact*i;
		}
		
		return fact;
		
		
	}
}
//Time complexity = O(n)
//Auxilary space = O(1)