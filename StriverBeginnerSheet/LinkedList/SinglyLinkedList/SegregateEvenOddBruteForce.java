/****************************************************************

 Following is the class structure of the Node class:

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
 
 Time complexity : 

 *****************************************************************/
import java.util.*;
public class SegregateEvenOddBruteForce
{
    public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                list.add(temp.data);
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data % 2 != 0){
                list.add(temp.data);
            }
            temp = temp.next;
        }

        int index = 0;

        temp = head;

        while(temp != null){
            temp.data = list.get(index++);
            temp = temp.next;
        }
    return head;
    }
}