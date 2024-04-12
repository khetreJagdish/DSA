public class LongestRepeatingCharacterReplacement_424_Brute {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        for(int i = 0; i<s.length(); i++){
            int[] hash = new int[26];
            int maxF = 0;
            for(int j = i; j<s.length(); j++){
				// count of each character
                hash[s.charAt(j)-'A']++;
				// max frequency of character
                maxF = Math.max(maxF,hash[s.charAt(j)-'A']);
                // to find how many changes we have to do ,  we need to apply formula as
				// int numberOfChanges = lengthOfSubstring - maxFrequencyOfCharacter
				int changes = (j-i+1)-maxF;
				// if changes are less than k , then only we will update the maxLength else break
                if(changes <= k){
                    maxLength = Math.max(maxLength,j-i+1); 
                }else{
                    break;
                }
            }
        }
    return maxLength;
        
    }
}