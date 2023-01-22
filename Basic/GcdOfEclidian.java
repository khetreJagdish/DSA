public class GcdOfEclidian{
	
	public static void main(String[] args){
		
		System.out.println(gcdOfEclidian(13,17));
	}
	
	static int gcdOfEclidian(int a, int b){
		
		if(b == 0){
			return a;
		}
		
		return gcdOfEclidian(b, a%b);
	}
}