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

