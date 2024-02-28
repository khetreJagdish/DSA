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

 *****************************************************************/
import java.util.*;
public class SortLLUsingBruteForce {
    public static Node sortList(Node head) {
        //Write your code here
        Node temp = head;
        List<Integer> list = new ArrayList<Integer>();

        while(temp != null){
         list.add(temp.data);
         temp = temp.next;
        }

        Collections.sort(list);

         temp = head;
         int i = 0;
         while(temp != null){
             temp.data = list.get(i);
             temp = temp.next;
             i++;
         }
        return head;
    }
}