// Time Complexity : O(N)
// Space Complexity : O(3)
public class FruitIntoBaskets_904_MostOptimized {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> fruitBasket = new HashMap<>(); // HashMap to store the types of fruits and their counts
        int maxFruits = 0;
        int left = 0;
        int right = 0;
        while(right < fruits.length) {
            int fruit = fruits[right];
            fruitBasket.put(fruit, fruitBasket.getOrDefault(fruit, 0) + 1); // Add fruit to basket
            
           
            if(fruitBasket.size() > 2){
            	// If there are more than 2 types of fruits, move the left pointer
                    int leftFruit = fruits[left];
                    fruitBasket.put(leftFruit, fruitBasket.get(leftFruit) - 1);
                    if (fruitBasket.get(leftFruit) == 0) {
                        fruitBasket.remove(leftFruit);
                    }
                    left++;
            }

             if(fruitBasket.size() <= 2) {
            	maxFruits = Math.max(maxFruits, right - left + 1); // Update maxFruits
            }
            right++;
        }
        
        return maxFruits;
    
    }
}