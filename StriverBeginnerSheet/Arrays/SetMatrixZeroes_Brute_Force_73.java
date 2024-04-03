
// Time complexity : O(m*n) * O(m+n) + O(m*n)
public class SetMatrixZeroes_Brute_Force_73 {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length;
        int column = matrix[0].length;

        // O(m*n) * O(m+n)
        for(int i =0; i<rows; i++){
            for(int j =0; j<column; j++){
                if(matrix[i][j] == 0){
                    markRows(matrix,i,column);
                    markColumn(matrix,j,rows);
                }
            }
        }

        // O(m*n)
        for(int i =0; i<rows; i++){
            for(int j =0; j<column; j++){
                if(matrix[i][j] == -8726){
                    matrix[i][j] = 0;
                }
            }
        }
    }   
        //O(m)
        public void markRows(int[][] matrix, int i,int column){
            for(int j =0; j<column;j++){
                if(matrix[i][j] != 0)matrix[i][j] = -8726;
            }
        }

        //O(n)
        public void markColumn(int[][] matrix, int j,int rows){
            for(int i =0; i<rows;i++){
                if(matrix[i][j] != 0)matrix[i][j] = -8726;
            }
        }
    
}