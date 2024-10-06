package com.takeuforward.array;

//Brute Force (m*n)
public class FindNthRootOfM_BruteForce {
	
	    public static  int NthRoot(int n, int m)
	    {
	        // code here
	        for(int i =1; i<=m; i++){
	            
	            int multiplication = 1;
	            
	            int temp = n;
	            
	            while(temp > 0){
	                multiplication = multiplication * i;
	                temp--;
	            }
	            
	            if(multiplication == m){
	                return i;
	            }
	        }
	    return -1;
	    }
	    
	  public static void main(String[] args) {
		System.out.println(NthRoot(2, 36));;
	}
}
