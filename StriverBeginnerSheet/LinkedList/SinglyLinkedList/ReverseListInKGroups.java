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
 };

 *****************************************************************/

public class ReverseListInKGroups {
    public static Node kReverse(Node head, int k) {
        // Write your code here.

        if(head == null){
            return null;
        }

        Node nextNode = null;
        Node temp = head;
        Node prevNode = null;

        int count = 0;
        int length = findLength(temp);
        temp = head;
        while(temp != null && count < k){
             nextNode = temp.next;
             temp.next = prevNode;
             prevNode = temp;
             temp = nextNode;
             count++;
        }

        if(nextNode != null && length-count >= k){
            head.next = kReverse(nextNode,k);
        }else{
            head.next = temp;
        }
    return prevNode;
    }

    private static int findLength(Node temp){
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
    return length;
    }
}