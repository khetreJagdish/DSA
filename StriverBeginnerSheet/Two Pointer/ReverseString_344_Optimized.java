// Time Complexity : O(N)
public class ReverseString_344_Optimized {
    public void reverseString(char[] s) {
         
         int low = 0;
         int high = s.length-1;

         while(low < high){

            if(s[low] != s[high]){
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
            }
            low++;
            high--;
         }
    }
}