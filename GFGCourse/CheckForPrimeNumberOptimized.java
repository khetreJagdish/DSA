public class CheckForPrimeNumberOptimized {
	
	
	/**** Optimized Approach : 
	 *     
	 *  
	 * @param number
	 * @return bo0lean value
	 */
	
	static boolean checkForPrime(int number){
		
		if(number ==1) {
			return false;
		}
		
		for(int i = 2; i<Math.sqrt(number);i += 2) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkForPrime(7));
	}
}
