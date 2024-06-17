public class LengthOfLongestSubstring_3_OptimizedUsingMap {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int length = s.length();
        while(right < length){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            maxLength = Math.max(maxLength,right-left+1);
            map.put(s.charAt(right),right);
            right++;
        } 
    return maxLength;   
    }
}