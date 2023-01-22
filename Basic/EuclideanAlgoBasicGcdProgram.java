public class EuclideanAlgoBasicGcdProgram{
	
	public static void main(String[] args){
		
		euclideanAlgoBasicGcdProgram(10,20);
	}
	
	static int euclideanAlgoBasicGcdProgram(int a, int b){
		
		while(a != b){
			
			if(a > b)
				a-b;
			else
				b-a;
		}
		return a;
	}
}