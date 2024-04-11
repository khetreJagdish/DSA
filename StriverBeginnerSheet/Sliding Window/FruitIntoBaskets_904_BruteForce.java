
// Time complexity : O(N^2)
// Space Complexity : O(3) : because the size of the HashSet could be max 3 and which is near about constant 
public class FruitIntoBaskets_904_BruteForce {
    public int totalFruit(int[] fruits) {
         int maxLength = 0;
        for(int i =0; i<fruits.length; i++){
            HashSet<Integer> set = new HashSet<>();

            for(int j =i; j<fruits.length; j++){
                    set.add(fruits[j]);
                    if(set.size() <= 2){
                        maxLength = Math.max(maxLength,j-i+1);
                    }else{
                        break;
                    }

            }
        }
    return maxLength;
    }
}