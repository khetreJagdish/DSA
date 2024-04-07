/**

Approach : Using Two pointer
Time Complexity : O(N) where N is the length of the String
Space Complexity : O(1)

Learning : Character class methods : 
	1) Character.isLetterOrDigit(char)
	2) Character.toLowerCase(char)
*/

public class ValidPalindrome_125_Approach3_Optimized {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(end);

            if(!Character.isLetterOrDigit(currentFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currentLast)){
                end--;
            }else{
                if(Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)){
                    return false;
                }

                start++;
                end--;
            }
        }
    return true;       
    }
}