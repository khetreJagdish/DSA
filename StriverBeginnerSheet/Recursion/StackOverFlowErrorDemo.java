public class StackOverFlowErrorDemo {
	public static void main(String[] args){
		print(5);
	}

	public static void print(int number){
		
		print(number-1);
		System.out.println(number);

	}
}