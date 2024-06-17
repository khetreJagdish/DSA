package com.tuf.recursion;
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
public class ReverseSinglyLL {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return false;
        }
        ListNode temp = head;
        ListNode head1 =  reverse(temp);
        ListNode head2 = head;

        while(head1 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

    return true;
        
    }

    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
    return prev;
    }
}