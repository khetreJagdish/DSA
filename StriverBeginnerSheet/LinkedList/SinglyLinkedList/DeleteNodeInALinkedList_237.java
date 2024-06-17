// Time complexity : O(1)
// Space complexity : O(1)
public class DeleteNodeInALinkedList_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;   
        node.next = node.next.next;
    }
}