package com.takeuforward.linkedlist;

public class ReverseLinkedListUsingRecursion {
	
	public static Node reverseLinkedListUsingRecursion(Node head) {
		
		if(head == null || head.next == null)
			return head;
		
		Node newHead = reverseLinkedListUsingRecursion(head.next);
		Node front = head.next;
		front.next = head;
		head.next = null;
		return newHead;		
	}
		
}
