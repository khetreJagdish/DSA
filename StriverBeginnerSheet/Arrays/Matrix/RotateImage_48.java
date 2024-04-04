public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // We can follow 2 Steps here :
		// 1) Do the Transpose Of Matrix
		// 2) Reverse only (n/2) Row of Matrix
		
		//Step I) Do the Transpose Of Matrix
        for(int i=0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
		//Step II) Reverse only (n/2) Row  Of Matrix
		// where n is length of matrix , if you reverse each row , you will get the same original matrix so don't
		// reverse each row
        for(int i =0; i<n; i++){
           for(int j =0; j<matrix.length/2;j++){
                int temp= matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
           }
        }   
    }
}