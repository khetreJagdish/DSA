
import java.util.*;
public class LongestSubstringwithAtMostKDistinctCharactersOptimized {

	public static int kDistinctChars(int k, String str) {
		// Write your code here

		int left = 0;
		int right =0;
		int maxLength = 0;
		Map<Character,Integer> map = new HashMap<>();

		while(right < str.length()){
			map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);

			if(map.size()<= k){
				maxLength = Math.max(maxLength,right-left+1);
			}else{
				while(map.size()>k){
					map.put(str.charAt(left),map.get(str.charAt(left))-1);
					if(map.get(str.charAt(left))==0){
						map.remove(str.charAt(left));
					}
					left++;
				}
			}
		right++;
		}
	return maxLength;
	}

}
