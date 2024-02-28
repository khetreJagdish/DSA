
class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 

public class LinkedListReverseUsingRecursion
{
    public static Node reverseLinkedList(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
/****************************************************************

Time Complexity : O(N)
Space Complexity : O(N) : due to the recursive function calls, as the call stack can potentially grow to the size of the number of nodes in the list.
*****************************************************************/