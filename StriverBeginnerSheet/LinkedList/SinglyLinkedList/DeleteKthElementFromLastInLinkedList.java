
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

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 }

 

public class DeleteKthElementFromLastInLinkedList
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        int len = calculateLength(head);

        K = len-K+1;
        
        if(K <1 || K > len){
            System.out.println("Node Can't be delete, Invalid K");
            return head;
        }

        if(K == 1){
            head = head.next;
            return head;
        }else{

            Node temp = head;
            Node prev = null;
            int count = 0;

            while(temp != null){
                count++;

                if(count == K){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        return head;
        }
    }

    private static int calculateLength(Node head){

        int count =0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
    return count;
    }

}