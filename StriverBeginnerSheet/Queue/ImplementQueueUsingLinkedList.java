public class ImplementQueueUsingLinkedList
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode  node = new QueueNode(a);
        if(front == null){
           
           front = node;
           rear = node;
        }else{
            
            rear.next = node;
            rear = rear.next;
        }
        
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null){
            rear = null;
            return -1;
        }
        
        int val = front.data;
        front = front.next;
        return val;
	}
}