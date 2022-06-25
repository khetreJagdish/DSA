import java.util.*;
public class SumOfTwoArraysElements{
	public static void main(String[] args){
		
		int array1[] = {10, 20, 30, 40, 50};
        int array2[] = {9, 18, 27, 36, 45};
		
		int[] finalArr = new int[5];
		for(int i=0;i<finalArr.length;i++){
			finalArr[i] =  array1[i]+array2[i];
		}
		
		System.out.println(Arrays.toString(finalArr));
		
	}
	
}