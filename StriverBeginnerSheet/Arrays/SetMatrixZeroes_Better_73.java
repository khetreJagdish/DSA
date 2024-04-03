/*Time Complexity : 

Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
Reason: We are traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

Space Complexity: O(N) + O(M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
Reason: O(N) is for using the row array and O(M) is for using the col array.

*/


/*
Approach (Using two extra arrays):

The steps are as follows:

1) First, we will declare two arrays: a row array of size N and a col array of size M and both are initialized with 0.
2) Then, we will use two loops(nested loops) to traverse all the cells of the matrix.
3) If any cell (i,j) contains the value 0, we will mark ith index of row array i.e. row[i] and jth index of col array col[j] as 1. It signifies that all the elements in the ith row and jth column will be 0 in the final matrix.
4) We will perform step 3 for every cell containing 0.
5) Finally, we will again traverse the entire matrix and we will put 0 into all the cells (i, j) for which either row[i] or col[j] is marked as 1.
6) Thus we will get our final matrix.

Intuition:

In the previous approach, we were marking the cells with -1 while traversing the matrix. But in this approach, we are not marking the entire row and column instead, we are marking the ith index of row array i.e. row[i], and jth index of col array i.e. col[j] with 1. These marked indices of the two arrays, row and col will tell us for which rows and columns we need to change the values to 0. For any cell (i, j), if the row[i] or col[j] is marked with 1, we will change the value of cell(i, j) to 0.

Here we are marking the cells after traversal whereas in the previous case, we were marking the cells while traversal. That is how the time complexity reduces in this case.



*/
public class SetMatrixZeroes_Better_73 {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int[] rows = new int[rowLength];
        int[] columns = new int[colLength];
        for(int i =0; i<rowLength; i++){
            for(int j =0; j<colLength; j++){
                if(matrix[i][j] == 0){
                    rows[i] = -32444;
                    columns[j] = -32444;
                }
            }
        }

        for(int i =0; i<rowLength; i++){
            for(int j=0; j<colLength; j++){
                if(rows[i] == -32444 || columns[j] == -32444){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
}