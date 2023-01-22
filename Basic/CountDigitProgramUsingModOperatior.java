public class CountDigitProgramUsingModOperatior{

	public static void main(String[] args){
		
		System.out.println(countDigitProgramUsingModOperatior(9235));
	
	}
	
	static int countDigitProgramUsingModOperatior(int number){
		
		int count = 0;
		while(number > 0){  // 9235
			count ++;
			int ld = number % 10;
			number = number/10;
		}
		
		return count;
		
		
	}
}