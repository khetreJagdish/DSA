public class RecursionDemo2{
	// Using Backtracking print 1 to N
	static void print(int n){
		if(n == 0){
			return ;
		}

		print(n-1);
		System.out.println(n);
		
	}
	public static void main(String[] args){
		print(5);
	}
}