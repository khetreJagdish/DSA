/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
 // Use Tortoise and Hare Algorithm
public class DeleteMiddleNodeUsingTortoiseAndHareAlgo {
    public ListNode deleteMiddle(ListNode head) {
		
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
		// We use Tortoise and Hare Algorithm to find the middle Node 
		// here  we will just do one extra step is , just skip one step of moving slow pointer to reach the 
		// node before the Node which we want to delete.
		// Below steps
        fast= fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}