/**

Algorithm for Merging Overlapping Intervals

    Input:
        A 2D array arr where each element is an interval represented as [start, end].

    Sort Intervals:
        Sort the intervals based on their starting points (arr[i][0]).
        If two intervals have the same starting point, sort them based on their ending points (arr[i][1]).

    Initialize an Empty List:
        Create an empty list list to store the merged intervals.

    Iterate Through Intervals:
        Loop through each interval in the sorted array:
            Condition 1: If list is empty or the current interval does not overlap with the last interval in list, add the current interval to list.
            Condition 2: If the current interval overlaps with the last interval in list, merge the intervals by updating the end of the last interval to the maximum end value between the two overlapping intervals.

    Output:
        Return list which contains all the merged intervals.


**/

import java.util.*;
public class MergeIntervals_Leetcode_56
 {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){

    List<List<Integer>> list = new ArrayList<>();


    Arrays.sort(arr, new Comparator<int[]>(){

        public int compare(int[] a , int[] b){
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        }
    });

 
    for(int i = 0; i<arr.length; i++){

        if(list.size() == 0 || arr[i][0] > list.get(list.size()-1).get(1) ){
            list.add(Arrays.asList(arr[i][0] ,arr[i][1] ));
        }else{
            list.get(list.size()-1).set(1,Math.max(list.get(list.size()-1).get(1),arr[i][1]));
        }
    }
    return list;        
    }
}