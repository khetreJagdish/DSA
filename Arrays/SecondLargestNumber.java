import java.util.*;
public class SecondLargestNumber{
	
	public static void main(String[] args){
			
		Integer[] array = {4,6,7,8,2,9};
		
		List<Integer> intArray = Arrays.asList(array);
		
		Collections.sort(intArray);
		
		int element = intArray.get(intArray.size()-2);
		
		System.out.println(element);
		
		
		
	}
}