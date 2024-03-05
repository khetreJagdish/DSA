/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }
     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/

public class DeleteAllOccurancesOfNode {
    public static Node deleteAllOccurrences(Node head, int k) {
        
		
        Node temp = head;

        while(temp != null){
            if(temp.data == k){

                if(temp == head){
                    head = head.next;
                }

                Node front = temp.next;
                Node back = temp.prev;

                if(front != null) front.prev = back;
                if(back != null) back.next = front;

                temp = temp.next;
            }else{
                temp = temp.next;
            }
        }
    return head;
    }
}