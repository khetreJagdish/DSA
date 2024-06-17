package com.takeuforward.doublylinkedlist;

public class DeleteNodeAtHead {
	
		public static Node deleteNodeAtHead(Node head) {
			
			if(head == null || head.next == null) {
				return null;
			}
			
			 Node front = head;
			 head = head.next;
			 front.next = null;
			 head.prev = null;
			 return head;			 
		}
	
	
}
