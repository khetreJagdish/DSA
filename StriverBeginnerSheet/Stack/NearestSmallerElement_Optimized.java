// TC : O(2N)
// SC : O(N) + O(N) 

public class NearestSmallerElement_Optimized {
    public int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer>  stack = new Stack<>();
        
        for(int i = 0; i< A.length; i++){
            
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                while(!stack.isEmpty() && stack.peek() >= A[i]){
                    stack.pop();
                }
                
                if(stack.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = stack.peek();
                }
            }    
            
            stack.push(A[i]);
        }
    return ans;
    }
}
