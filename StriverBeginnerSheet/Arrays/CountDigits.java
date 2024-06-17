
import java.util.Scanner;
public class CountDigits{

	private static long countDigit(long digit){
		long count = 0;
		while(digit > 0){
			count++;
			digit = digit/10;
		}
		return count;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");
		long digit = sc.nextLong();
		System.out.println("Number of Digits in the Number are :"+countDigit(digit));
		
	}

} 