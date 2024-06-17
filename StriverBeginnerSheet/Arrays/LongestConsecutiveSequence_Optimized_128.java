import java.util.HashSet;
public class LongestConsecutiveSequence_Optimized_128 {

    // Time complexity : O(N) + O(2*N) ~ O(3*N), where N = size of the array.
	// Reason: O(N) for putting all the elements into the set data structure. After that for every starting element, we //are finding the consecutive elements. Though we are using nested loops, the set will be traversed at most twice //in the worst case. So, the time complexity is O(2*N) instead of O(N2).
	// Space Complexity : O(N)
    public int longestConsecutive(int[] nums) {
        
        // Add all the elements in HashSet
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int longest = 0;
        for(int number :nums){
            set.add(number);
        }

        for(int number : set){
            if(!set.contains(number-1)){
                count = 1;
                int element = number;

                while(set.contains(element+1)){
                    count++;
                    element = element+1;
                }
            longest = Math.max(longest,count);
            }
        }
    return longest;
    }
}