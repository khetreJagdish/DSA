package com.takeuforward.linkedlist;

public class ReverseLinkedListIterative {
	
	public static Node reverseLinkedListIteratively(Node head) {
		
		Node temp = head;
		Node prev = null;
		
		while(temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev =temp;
			temp = front;
		}
		
		return prev;
	}
}
