/*
Algorithm:

1) Place the 2 pointers i.e. low and high: Initially, we will place the pointers. The pointer low will point to 0 and the high will point to (NxM)-1.

2) Calculate the ‘mid’: Now, inside the loop, we will calculate the value of ‘mid’ using the following formula:
mid = (low+high) // 2 ( ‘//’ refers to integer division)

3) Eliminate the halves based on the element at index mid: To get the element, we will convert index ‘mid’ to the corresponding cell using the above formula. Here no. of columns of the matrix = M.
row = mid / M, col = mid % M.
		1) If matrix[row][col] == target: We should return true here, as we have found the ‘target’.
		2) If matrix[row][col] < target: In this case, we need bigger elements. So, we will eliminate the left half and consider the right half (low = mid+1).
		3) If matrix[row][col] > target: In this case, we need smaller elements. So, we will eliminate the right half and consider the left half (high = mid-1).
		4) Steps 2-3 will be inside a while loop and the loop will end once low crosses high
		(i.e. low > high). If we are out of the loop, we can say the target does not exist in the matrix. So, we will return false.


*/


public class BinarySearchOn2DMatrixOptimized {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = (m*n)-1;

        while(low <= high){

            int mid = low + (high-low)/2;
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    return false;
    }
}