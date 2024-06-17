public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        
		int[] arr = new int[26];
		
        // store first string in Array
		for(char c : s.toCharArray()) {
			arr[c -'a']++;
		}
		
        // then remove each 
		for(char c : t.toCharArray()) {
			arr[c -'a']--;
		}
		
		for(int val : arr) {
			if(val != 0) {
				return false;
			}
		}
	 return true;
    }
}