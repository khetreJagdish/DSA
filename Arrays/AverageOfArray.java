public class AverageOfArray{
	
	public static void main(String[] args){
		
		int[] arr = {4,5,6,3,7,8,9};
		
		//sum of Array Element
		//divide sum by number of Array elements
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		
		double average = (sum/arr.length);
		
		System.out.println(average);
		
		
		
	}
}