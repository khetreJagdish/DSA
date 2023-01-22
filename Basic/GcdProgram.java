import java.util.*;
//Naive Solution
public class GcdProgram{
	//Time Complexity is O(min(a,b));
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter second Number :");
		int b = sc.nextInt();
		System.out.println("GCD of Two Numbers : "+gcd(a,b));
	
	}
	
	
	static int gcd(int a, int b){
		
		int res = Math.min(a,b);
		
		while(res > 0){
			if(a%res == 0 && b%res == 0){
				break;
			}
			res--;
		}
		
		return res;
		
	}
}