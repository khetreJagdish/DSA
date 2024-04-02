// Time Complexity : O(NlongN)+O(N)
/*

Algorithm:
We will consider 3 variables, 
‘lastSmaller’ →(to store the last included element of the current sequence), 
‘cnt’ → (to store the length of the current sequence), 
‘longest’ → (to store the maximum length).
Initialize ‘lastSmaller’ with ‘INT_MIN’, ‘cnt’ with 0, and ‘longest’ with 1(as the minimum length of the sequence is 1).
The steps are as follows:

First, we will sort the entire array.
To begin, we will utilize a loop(say i) to iterate through each element one by one.
For every element, we will check if this can be a part of the current sequence like the following:
1) If arr[i]-1 == lastSmaller: The last element in our sequence is labeled as 'lastSmaller' and the current element 'arr[i]' is exactly 'lastSmaller'+1. It indicates that 'arr[i]' is the next consecutive element. To incorporate it into the sequence, we update 'lastSmaller' with the value of 'arr[i]' and increment the length of the current sequence, denoted as 'cnt', by 1.
2) If arr[i] == lastSmaller: If the current element, arr[i], matches the last element of the sequence (represented by 'lastSmaller'), we can skip it since we have already included it before.
3) Otherwise, if lastSmaller != arr[i]: On satisfying this condition, we can conclude that the current element, arr[i] > lastSmaller+1. It indicates that arr[i] cannot be a part of the current sequence. So, we will start a new sequence from arr[i] by updating ‘lastSmaller’ with the value of arr[i]. And we will set the length of the current sequence(cnt) to 1.
Every time, inside the loop, we will compare ‘cnt’ and ‘longest’ and update ‘longest’ with the maximum value. longest = max(longest, cnt)
Finally, once the iteration is complete, we will have the answer stored in the variable ‘longest’.

*/
public class LongestConsecutiveSequence_Better_128 {
    public int longestConsecutive(int[] nums) {
        
        int longest = 0;
        int lastSmallest = Integer.MIN_VALUE;
        int count = 0;
        
        Arrays.sort(nums);  // TC : O(NlongN)

        // TC : O(N)
        for(int i = 0; i<nums.length; i++){
            if(nums[i]-1 == lastSmallest){
                count++;
                lastSmallest = nums[i];
            }else if(nums[i] != lastSmallest){
                count = 1;
                lastSmallest = nums[i];
            }
        longest = Math.max(longest,count);    
        }
    return longest;
    }

}