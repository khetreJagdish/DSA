import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int numOfRows = scanner.nextInt();
		System.out.println("Enter Number of Column : ");
		int numOfColumns = scanner.nextInt();
		
		int[][] metrix = new int[numOfRows][numOfColumns];
		
		System.out.println("Enter Elements");
		for(int i =0; i< numOfRows; i++) {
			for(int j = 0; j< numOfColumns; j++) {
				metrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("================== Print Metrix ===================");
		for(int i = 0; i< metrix.length; i++) {
			for(int j = 0; j< metrix[i].length; j++) {
				System.out.print(metrix[i] [j] + " ");
			}
			System.out.println();
		}
		
	}
	

}
