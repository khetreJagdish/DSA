public class InsertElementAtSpecificPosition{
	
	public static void main(String[] args){
		
		int[] array = {10, 20, 30, 40, 50};
		
		insertElementAtIndex(array,3,45);
		
		
	}
	
	public static void insertElementAtIndex(int[] array , int index, int element){
		
		int[] newArr = new int[array.length+1];
		//10,20,30,40,50          , index = 3  , element = 45
		for(int i = 0; i< newArr.length;i++){
			if(i == index){
			   newArr[index] = element;
			}else{
				newArr[i] = array[i];
			}
			
		}
		
	}

}