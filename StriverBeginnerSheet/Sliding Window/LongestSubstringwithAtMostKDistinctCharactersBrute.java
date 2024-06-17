
import java.util.*;
public class LongestSubstringwithAtMostKDistinctCharactersBrute {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
		int maxLength = 0;
		for(int i =0; i<str.length();i++){
			Set<Character> set = new HashSet<>();
			for(int j = i; j<str.length();j++){
				set.add(str.charAt(j));

				if(set.size() > k){
					break;
				}
				maxLength = Math.max(maxLength,j-i+1);
			}
		}
	return maxLength;
	}

}
