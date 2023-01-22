public class CountDigits{
	
	public static void main(String[] args){
		
		System.out.println(countDigits(0245670));
		
	}
	
	static int countDigits(int number){
		
		int count = 0;
		while(number > 0){
			number = number / 10;
			count++;
		}
		return count;
		
	}
}