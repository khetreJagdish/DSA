public class  CounttheNumberofConsistentStrings_Brute_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashMap<Character,Integer> map = new HashMap<>(allowed.length());

        // Overall Timecomplexity : O(M+(N*K))
        // Space Complexity : O(26) 

        
        // O(M) : Length of allowed String
        // Because atmax we can have 26 character in String 
        // 1 <= allowed.length <= 26 given in constraints
        for(int i =0; i<allowed.length();i++){
            map.put(allowed.charAt(i),map.getOrDefault(allowed.charAt(i),0)+1);
        }

        int count = 0;
        // O(N) for N Strings which are there in words array [N : length of words Array]
        for(int i =0; i<words.length; i++){
            boolean flag = true;
            //O(K) for each String length [K : length of String]
            for(int j =0; j<words[i].length();j++){
                if(!map.containsKey(words[i].charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
    return count;
    }
}