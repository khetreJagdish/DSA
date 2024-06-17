public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        //Maintain two pointer current and prev
        ListNode current = head;
        // Use dummyNode approach
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;

        dummyNode.next = current;

        while(current != null){
            if(current.val == val){
                // if we remove current node , we will not update the prev node pointer 
                prev.next = current.next;
            }else{
                // if we don't remove current node , we will update the prev node pointer to current 
                prev = current;
            }
            // regardless of removing/non removing case we will move current to the next
            current = current.next;
        }
    return dummyNode.next;
    }
}