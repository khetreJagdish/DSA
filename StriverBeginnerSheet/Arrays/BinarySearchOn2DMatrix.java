/* 
Time Complexity: O(N + logM), where N = given row number, M = given column number.
Reason: We are traversing all rows and it takes O(N) time complexity. But for all rows, we are not applying binary search rather we are only applying it once for a particular row. That is why the time complexity is O(N + logM) instead of O(N*logM).

Space Complexity: O(1) as we are not using any extra space.

*/

import java.util.ArrayList;
public class BinarySearchOn2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size();
        int m = mat.get(0).size();

        for(int i =0; i<mat.size(); i++){
            if(mat.get(i).get(0) <= target && target <= mat.get(i).get(m-1)){
                return binarySearch(mat.get(i),target);
            }
        }
    return false;
    }

    static boolean binarySearch(ArrayList<Integer> list, int target){

        int low = 0;
        int high = list.size()-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(list.get(mid) == target){
                return true;
            }else if(target > list.get(mid)){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
