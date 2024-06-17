

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class ReversingDLL{
public static Node reverseDLL(Node  head)
   {
    //Your code here
    
		if(head == null || head.next == null){
        return head;
		}
    
    Node current = head;
    Node node = null;
    while(current != null){
     node = current.prev;
     current.prev = current.next;
     current.next = node;
     current = current.prev;
		}
		return node.prev;
    }
}