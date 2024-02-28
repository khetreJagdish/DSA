public class DeleteNodeAtGivenPosition
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	
	    
	  if(x == 1){
	      head = head.next;
	      return head;
	  }
	  Node temp = head;
	  Node prev = null;
	  int count = 0;
	  
	  while(temp != null){
	      
	      count++;
	      if(count == x){
	          prev.next = prev.next.next;
	          break;
	      }
	      prev = temp;
	      temp = temp.next;      
	  }
	  return head;
	
    }
}