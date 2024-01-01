import java.util.Scanner;
public class PalindromeNumber{
	
	private static boolean isPalindrome(long number){
		
		long reverseNumber = 0;
		long originalNumber = number;
		while(number != 0){
			reverseNumber = (reverseNumber * 10) + number % 10;
			number = number /10;
		}
		
		return originalNumber == reverseNumber;
		
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		long number = sc.nextLong();
		System.out.println("is Given Number Palindrome : " + isPalindrome(number));
		
	}
}