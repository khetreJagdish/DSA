package com.gfg;
class FindMissingNumber {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        
        int x1 = array[0];
        int x2 = 1;
        
        
        for(int i = 0; i<n; i++){
            x1 = x1 ^ array[i];
        }
        
        for(int i = 3; i<= n+1; i++){
            x2 = x2 ^ i;
        }
        
        return (x1 ^ x2);
    }
    
    
    public static void main(String[] args) {
		FindMissingNumber findMissingNumber = new FindMissingNumber();
		int[] a = {2,1,3,5};
		int num = findMissingNumber.MissingNumber(a, 4);
		System.out.println(num);
	}
}