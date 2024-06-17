// Time complexity : O(N*logN)
// Space Complexity : O(1) 
public class BoatsToSavePeople_881 {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int low = 0;
        int high = people.length-1;
        int boatCount = 0;
        
        while(low <= high){
            if(people[low] + people[high] <= limit){
                low++;
                high--;
            }else{
                high--;
            }
            boatCount++;
        }

    return boatCount;
    }
}