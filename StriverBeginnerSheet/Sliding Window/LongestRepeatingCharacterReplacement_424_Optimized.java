public class LongestRepeatingCharacterReplacement_424_Optimized {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right =0;
        int maxLength = 0;
        int[] hash = new int[26];
        int maxF = 0;
        while(right < s.length()){
            hash[s.charAt(right)-'A']++;
            maxF = Math.max(maxF,hash[s.charAt(right)-'A']);
            int changes =(right-left+1)-maxF;
				
            if(changes <= k){
                maxLength = Math.max(maxLength,right-left+1);
            }else{
                hash[s.charAt(left)-'A']--;
                left++;
            }
        right++;
        }
    return maxLength;
    }
}