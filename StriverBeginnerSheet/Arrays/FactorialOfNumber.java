import java.util.Scanner;
public class FactorialOfNumber{
	
	static int factorial(int number){
		
		int res = 1;
		
		for(int num = 2; num <= number; num++){
			res = res * num;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		System.out.println("Factorial : "+factorial(num));
	}
}