import java.util.*;
public class ArrayReturn{
	
	public static void main(String[] args){
		//1.take array as input
		int[] arr = getArray();
		
		//2,3,2,3,6,7,8,9,9
		System.out.println("Print Array by using for Loop(Only deplicate Elements)");
		for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
						if(arr[i] == arr[j]){
					System.out.print(" "+arr[i]);
			}
		}	
			
		}
		System.out.println();
		System.out.println("Print Array by using for-Each loop");
		for(int num:arr){
			System.out.print(" "+ num);
		}
		
		System.out.println("Print Array by using Arrays.toString(arr) loop");
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] getArray(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int arraySize = scanner.nextInt();
		int[] arr = new int[arraySize];
		
		System.out.println("Enter "+ arraySize +" Array Elements : ");
		
		for(int i=0; i<arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		return arr;
		
	}
}