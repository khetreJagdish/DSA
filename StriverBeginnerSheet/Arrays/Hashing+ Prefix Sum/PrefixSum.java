import java.util.*;
public class PrefixSum{
	
	public static int[] findPrefixArray(int[] nums){
		int[] prefixArray = new int[nums.length];
		prefixArray[0] = nums[0];
		for(int i = 1; i<nums.length; i++){
			int sum = 0;
			for(int j =0; j<= i; j++){
				sum += nums[j];
			}
			prefixArray[i] = sum;
		}
	return prefixArray;
	}
	public static void main(String[] args){
			int[] arr = {-3,6,2,4,5,2,8,-9,3};
			System.out.println(Arrays.toString(findPrefixArray(arr)));
	}
}

// Time Complexity : O(N^2)