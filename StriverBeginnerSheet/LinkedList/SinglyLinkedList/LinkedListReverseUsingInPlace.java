
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

 

public class LinkedListReverseUsingInPlace
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.

        Node prev = null;
        Node temp = head;

        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            
        }
    return prev;
    }
}




/****************************************************************
Approach :
   The main idea is to flip the order of connections in the linked list, which changes the direction of the arrows. When this happens, the last element becomes the new first element of the list. This in-place reversal allows us to efficiently transform the original list without using extra space.
   
   Time Complexity : 0(N)
   Space Complexity : O(1)

*****************************************************************/