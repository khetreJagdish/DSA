/**

Using Built in Funtions : Character class

  Time Complexity : O(N) where N is the length of String
  Space Complexity : O(N)
  
  Learning Character class method :
      1) Character.isLetterOrDigit(s.charAt(i)
	  2) Character.isAlphabetic(s.charAt(i))
	  3) Character.isDigit(s.charAt(i))
 */

class ValidPalindrome_125_Approach2 {
    public boolean isPalindrome(String s) {
        String  s2 ="";
		for(int i =0; i<s.length();i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				s2 +=s.charAt(i);
			}
		}
		
		s2 = s2.toLowerCase();
		String builder = new StringBuilder(s2).reverse().toString();
        if(s2.equals(builder)) return true;
        return false;
    }
}