// Time Complexity : O(N) + O(N) i.e. O(2N) // due to inner while loop
// Space Complexity : O(3) because HashMap can store max 3 elements
public class FruitIntoBaskets_904_Optimized {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int right = 0;
        int length = fruits.length;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // Traverse till Array length 
        while(right < length){
            int rightFruit = fruits[right];

            // if map contains the element , increase the count by one else put count as 1
            // use of map.getOrDefault(rightFruit,0) method
            map.put(rightFruit,map.getOrDefault(rightFruit,0)+1);

            // if map.size() <= 2 , calculate he maxLength
            if(map.size() <= 2){
                maxLength = Math.max(maxLength,right-left+1);
            }else{
                // else trim down the left and remove one by one element from map
                while(map.size() > 2){
                    int leftFruit = fruits[left];
                    map.put(leftFruit,map.get(leftFruit)-1);
                    if(map.get(leftFruit) == 0){
                        map.remove(leftFruit);
                    }
                left++;
                }
            }
        right++;
        }
    return maxLength;
    }
}