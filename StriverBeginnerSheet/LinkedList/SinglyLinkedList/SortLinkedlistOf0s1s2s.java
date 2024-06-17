import java.util.*;
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

public class SortLinkedlistOf0s1s2s
{
    public static Node sortList(Node head) {
        // Write your code here

    List<Integer> list = new ArrayList<Integer>();

    Node temp =head;

    while(temp != null){
        list.add(temp.data);
        temp = temp.next;
    }

    Collections.sort(list);

    temp = head;

    int count = 0;
    while(temp != null){
        temp.data = list.get(count);
        temp = temp.next;
        count++;
    }

    return head;

    }
}