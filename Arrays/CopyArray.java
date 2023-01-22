import java.util.Arrays;
public class CopyArray{
	
	public static void main(String ... args){
		int arr[] = {10, 20, 30, 40, 50};
		
		int[] newArray = arr;
		
		System.out.println(Arrays.toString(newArray));
		
		System.out.println("After Modification");
		
		arr[0] = 555;
		arr[3] = 465;
		
		System.out.println(Arrays.toString(newArray));
	}
}