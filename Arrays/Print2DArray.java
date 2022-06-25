import java.util.*;
public class Print2DArray{
	
	public static void main(String[] args){
			
		int[][] array2D = {{3,4,5},{6,5,3},{7,5,3}};
	
	    for(int[] i: array2D){
		   for(int j:i){
			   System.out.println(j);
		   }
	    }
		System.out.println();
		for(int i=0;i<array2D.length;i++){
			for(int j=0;j<array2D[i].length;j++){
				System.out.print(" "+array2D[i][j]);
			}
		}
		
		System.out.println();
		
		
		System.out.println("Print Array By Using Arrays.deepToString(arr)");
		
		System.out.println(Arrays.deepToString(array2D));
		
	}
	
	
}