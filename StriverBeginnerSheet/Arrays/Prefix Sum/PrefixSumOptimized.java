import java.util.*;
public class PrefixSumOptimized{
	
	public static int[] findPrefixArray(int[] nums){
		int[] prefixArray = new int[nums.length];
		prefixArray[0] = nums[0];
		int sum = nums[0];
		for(int i = 1; i<nums.length; i++){
			sum += nums[i];
			prefixArray[i] = sum;
		}
	return prefixArray;
	}
	public static void main(String[] args){
			int[] arr = {-3,6,2,4,5,2,8,-9,3};
			System.out.println(Arrays.toString(findPrefixArray(arr)));
	}
}

// Time Complexity : O(N)