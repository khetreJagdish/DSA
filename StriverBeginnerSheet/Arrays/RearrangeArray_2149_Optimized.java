/*

**Hint :** Based on given conditions : 
1) We have to have positive number on even indexes and negative number on odd indexes ,
2) Array should start from positive only i.e. on 0th index only positive should be there
so keep two pointers , one for even and one for odd index and 
when any number (either on even index or on odd index) gets added into array , increment the respetive counter by 2.

// Time Complexity : O(N) , as we are traversing through the whole array
// Space complexity : O(N) we are using Array to return the Answer


*/

public class RearrangeArray_2149_Optimized {
    public int[] rearrangeArray(int[] nums) {

        int count1 =0;
        int count2 =1;
        int[] arr  = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            if(nums[i] >= 0){
                arr[count1] = nums[i];
                count1 = count1+2;
            }else{
                arr[count2] = nums[i];
                count2 = count2+2;
            }
        }
    return arr;
    }
}