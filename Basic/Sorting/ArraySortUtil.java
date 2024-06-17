import java.util.Arrays;
class Point implements Comparable<Point> {
	int x;
	int y;

	Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int compareTo(Point p){
		return this.x -p.x; 
	}

	public String toString(){
		return "["+x+" "+y+"]";
	}

}

public class ArraySortUtil{
	public static void main(String[] args){
		Point[] arr = {new Point(2,4),new Point(4,5),new Point(6,7)};
		Arrays.sort(arr);

		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}