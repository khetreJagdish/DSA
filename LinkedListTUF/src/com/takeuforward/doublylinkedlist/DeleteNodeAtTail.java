package com.takeuforward.doublylinkedlist;

public class DeleteNodeAtTail {
	
	public static Node deleteNodeAtTail(Node head) {
		System.out.println("Delete Node At Tail : ");
		Node tail  = head;
		
		if(head == null || head.next == null) {
			return null;
		}
		
		while(tail.next != null) {
			tail = tail.next;
		}
		
		Node back = tail.prev;
		tail.prev = null;
		back.next = null;
		return head;
	}
}
