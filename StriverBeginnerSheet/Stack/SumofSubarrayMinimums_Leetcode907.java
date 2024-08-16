
// Time Complexity:O(n) due to linear scans in main function and each helper function
//Space Complexity:O(n) for storing the nsl and nsr arrays

public class SumofSubarrayMinimums_Leetcode907 {
    Stack<Integer> stack = new Stack<>();
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nsl = findNSL(arr , n);
        stack.clear();
        int[] nsr = findNSR(arr , n);
        int mod = 1000000007;
        long totalSum = 0;
        for(int i =0; i<n; i++){

            long left = i - nsl[i];
            long right = nsr[i] - i;

            long product = left * right;

            long sum = arr[i] * product;
            totalSum = (totalSum+sum) % mod;
        }
    return (int)totalSum;
    }

    private int[] findNSL(int[] arr , int n){
        int[] nsl = new int[n];

        for(int i = 0; i<n; i++){

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(i);
        }
    return nsl;
    }
    
    private int[] findNSR(int[] arr, int n){
        int[] nsr = new int[n];

        for(int i = n-1; i>= 0; i--){

            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? n : stack.peek();
        stack.push(i);
        }
    return nsr; 
    }
}