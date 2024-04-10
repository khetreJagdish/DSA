public class LengthOfLongestSubstring_3_BetterUsingSet {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int length = s.length();
        HashSet<Character> set = new HashSet<>();
        while(right < length){
            if(set.contains(s.charAt(right))){
				// if found then remove from left till below condition satisfies
                while(left < right && set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }

            }
            maxLength = Math.max(maxLength,right-left+1);
            set.add(s.charAt(right));
            right++;
        }
    return maxLength;
    }
}