public class CountDigitProgram{

	public static void main(String[] args){
		
		System.out.println(countDigit(1));
	
	}
	
	
	static int countDigit(int number){
		
		int count = 0;
		while(number > 0){
			
			number = number/10;
			count++;
		}
		return count;
		
	}
}