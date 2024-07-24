/**
Push Operation:

    Simply enqueue the new element into the first queue (queue1).

Pop Operation:

    Transfer all elements from queue1 to queue2 except for the last element.
    Dequeue and return the last element from queue1, which is the top of the stack.
    Swap the names of queue1 and queue2.
	
Top Operation
	Same as pop  just pop the last element and then again push to queue and swap names.

*/


public class MyStackUsingTwoQueue {

    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
      
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int topElement = q1.poll();
        Queue<Integer> temp  = q1;
        q1 = q2;
        q2 = temp; 
        return topElement;
    }
    
    public int top() {
        
        while(q1.size()> 1){
            q2.offer(q1.poll());
        }
        int topElement = q1.poll();
        q2.offer(topElement);
        Queue<Integer> temp  = q1;
        q1 = q2;
        q2 = temp; 
       return topElement;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }
        return false;
    }
}

