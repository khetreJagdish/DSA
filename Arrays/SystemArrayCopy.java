import java.util.Arrays;
public class SystemArrayCopy{
	
	public static void main(String ... args){
		
		//The System.arraycopy() method in Java is given to copy an array to another array. It copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
		
		//Syntax of the arraycopy() method in java.lang.System class:- 
		//public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		
		  // original array
		int arr[] = { 10, 20, 30, 40, 50 };
		
		int[] newArr = new int[arr.length];
		System.arraycopy(arr,0,newArr,0,arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}