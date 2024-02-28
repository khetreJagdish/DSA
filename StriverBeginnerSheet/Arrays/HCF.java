public class HCF {
	
	static int hcf(int a, int b){
		
		if(b == 0){
			return a;
		}
	  return hcf(b,a%b);
	}
	public static void main(String[] args){
		int a = 12;
		int b = 15;
		int hcf = hcf(a,b);
		System.out.println(hcf);
	}
}