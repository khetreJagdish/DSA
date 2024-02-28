import java.util.Stack;
public class ReverseDLLUsingStack
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        
		
		Node temp = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		
		while(temp != null){
			temp.data  = stack.peek();
			stack.pop();
			temp = temp.next;
		}
		return head;
		
		
		
		
	
    }
}