public class PalindromeNumber1{

	public static void main(String[] args){
		
		System.out.println(isNumberPalindrome(25353));//35352  False
		System.out.println(isNumberPalindrome(25325));//25325  True
	
	}
	
	static boolean isNumberPalindrome(int number){
		
		int temp = number;
		
		int reverse = 0;
		
		while(temp >= 0){
			
			int lastDigit = temp % 10;
			
			reverse = reverse * 10 + lastDigit;
			
			temp = temp/10;
			
		}
		
		return (reverse == number);
		
	}
}