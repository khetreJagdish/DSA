public class RecursionDemo1{
	static int count = 0;

	static void print(){
		if(count == 3){
			return;
		}
		
		count++;
		print();
		System.out.println(count);
	}
	public static void main(String[] args){
		print();
	}
}