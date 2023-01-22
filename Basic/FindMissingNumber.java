public class FindMissingNumber
{	
	public static void main(String[] args){
		
	int[] a = {1,5,3,2};
	int n = 5;
	
	
		int num = findMissingNumber(a,n);
		System.out.println(num);
	}
	
	static int findMissingNumber(int[] a , int n){
		
		
		int X1 = a[0];
		int X2 = 1;
		
		
	for(int i = 0; i <n; i++){
		
		X1 = X1 ^ a[i];
	}
	
	for(int i = 2; i<= n+1;i++){
		
		X2 = X2 ^ i;
	}
	
	return (X1 ^ X2);
	}
	
	
}