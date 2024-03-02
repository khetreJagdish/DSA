package com.takeuforward.linkedlist;
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
    public static boolean isPalindrome(Node head) {
        
        if(head == null || head.next == null){
            return true;
        }
        Node temp = head;
        Node head2 = head;
        Node head1 =  reverse(temp);
       // head = head1;

        while(head1 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

    return true;
        
    }

    public static Node reverse(Node head){
    	Node temp = head;
    	Node prev = null;

        while(temp != null){
        	Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
    return prev;
    }
    
    public static void main(String[] args) {
		
	}
}