import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}

public class DeleteNodeAtKthPositionInDLL
{
    
   Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }

         Node temp = head;
         head = head.next;
         head.prev = null;
         temp.next = null;
         return head;

    }

    Node deleteTail(Node head){

        if(head == null || head.next == null){
            return null;
        }

        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        Node back = tail.prev;
        tail.prev = null;
        back.next = null;
        return head;
    }

    
    
    Node deleteNode(Node head,int x)
    {
	
	
	    Node temp = head;
        int count = 0;

        while(temp != null){
            count++;

            if(count == x){
                break;
            }
            temp = temp.next;
        }

        Node front = temp.next;
        Node back = temp.prev;


        if(front == null && back == null){
            return null;
        }
        else if(back == null){
            return deleteHead(head);
        }else if(front == null){
            return deleteTail(head);
        }

        back.next = front;
        front.prev = back;
        temp.next =null;
        temp.prev = null;

    return head;
    }
}
