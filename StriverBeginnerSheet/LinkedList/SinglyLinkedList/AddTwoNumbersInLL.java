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
public class AddTwoNumbersInLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //Assign l1 and l2 to temp node t1 and t2  
        ListNode t1 = l1;
        ListNode t2 = l2;
        // delare a carry variable to store carry if we have 
        int carry = 0;

        // Create Dummy Node
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        //traverse untill either t1 != null OR t2 != null
        while(t1 != null || t2 != null){
            int sum = carry;
            // it will avoid any NLP , because length of any LL can be smaller than other LL

            if(t1 != null) sum = sum + t1.val;
            if(t2 != null) sum = sum + t2.val;
            // Create New Node with Sum as value
            ListNode newNode = new ListNode(sum%10);
            carry = sum /10;

            current.next = newNode;
            current = current.next;

            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
    return dummyNode.next;
    }
}