public class DeleteTailDLL
{
    public static Node deleteLastNode(Node head) {
        // Write your code here

        if(head == null || head.next == null){
            return null;
        }
         Node mover = head;
        while(mover.next != null){
            mover = mover.next;
        }
        Node back = mover.prev;
        back.next = null;
    return head;
    }
}