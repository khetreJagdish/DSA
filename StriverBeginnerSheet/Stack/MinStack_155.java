public class MinStack_155 {
    // create two stack one for Storing all elements 
    // minStack : for storing minValue element in O(1) time
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    //1) for Normal stack we will directly push val into it directly,
    //but for minStack we will check first if minStack is Empty OR
    // the value which we are trying to push is less than the current minStack top value
    // if yes then we will push the value into minStack as well otherwise we will not 
    // push that value into minStack if the value we are trying to push is greater
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }    
    }
    // while pop() also first we will check we are not removing the minValue from the minStack
    // so if we are poping any value from stack so we will compare that with minSTack top value
    // if those match then only we will remove from both stack
    // else we will remove it from Normal stack only
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */