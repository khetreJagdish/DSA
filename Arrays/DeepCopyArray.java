import java.util.Arrays;
public class DeepCopyArray{
	public static void main(String ... args){
		
		int arr[] = {10, 20, 30, 40, 50};
		
		int[] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		System.out.println("After Modification");
		
		arr[2] = 6888;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
	}
}