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
public class RotateLinkedListToRightByKPosition {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next ==null){
            return head;
        }

        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        if(k % length == 0) return head;
        if(k > length) k = k % length;

        temp.next = head;
        temp = head;
        int posOfLastNode = length-k;
        int count = 0;
        while(temp != null){
            count++;
            if(count == posOfLastNode){
                head = temp.next;
                temp.next = null;
            }
        temp = temp.next;
        }

    return head;
    }
}