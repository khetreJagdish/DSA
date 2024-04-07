
// 1) Using ASCII values
/***
The time and space complexity of the provided code can be analyzed as follows:

Time Complexity:

The removeNonAlphaNumericChars method iterates over each character of the input string, which takes O(n) time, where n is the length of the original string.
The subsequent operations like replaceAll, toLowerCase, and reverse each take O(n) time.
Thus, the overall time complexity is O(n), where n is the length of the input string.
Space Complexity:

The space complexity is primarily determined by the additional space used to store the modified strings.
The removeNonAlphaNumericChars method creates a StringBuilder object to store the modified string, which takes O(n) space, where n is the length of the original string.
The reverse method also creates a new StringBuilder object to store the reversed string, adding another O(n) space.
Therefore, the overall space complexity is O(n), where n is the length of the input string.

In summary, both time and space complexities are O(n), where n is the length of the input string.

 */
public class ValidPalindrome_125_Approach1 {
    public boolean isPalindrome(String s) {
        
        String nonAlphanumericString = removeNonAlphaNumericChars(s).replaceAll("\\s","").toLowerCase();
        String reverse = new StringBuilder(nonAlphanumericString).reverse().toString();

        if(nonAlphanumericString.equals(reverse)){
            return true;
        }
    return false;
    }

    public String removeNonAlphaNumericChars(String originalString){

         String builder = new String();
        for(int i =0; i<originalString.length();i++){
            int ascii = originalString.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                builder += originalString.charAt(i);
            }else if(ascii >= 97 && ascii <= 122){
                builder += originalString.charAt(i);
            }else if(ascii >= 48 && ascii <= 57){
                builder += originalString.charAt(i);
            }   
        }
    return builder;
    }
}