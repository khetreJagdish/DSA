public class StringSubSequence{
	public static void main(String[] args){
		
		System.out.println(isStringSubsequence("DA","ABCD",0,0));
	}
	
static boolean isStringSubsequence(String s1, String s2, int a, int b){
		  
		  if(a == s1.length()){
			  return true;
		  }
		  
		  if(b == s2.length()){
			  return false;
		  } 	
		  
		  if(s1.charAt(a) == s2.charAt(b)){
			  return isStringSubsequence(s1,s2,a+1,b+1);
		  }
		return isStringSubsequence(s1,s2,a,b+1);
	}
}