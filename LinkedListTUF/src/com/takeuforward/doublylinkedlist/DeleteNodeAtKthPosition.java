package com.takeuforward.doublylinkedlist;

public class DeleteNodeAtKthPosition {
	public static Node deleteNodeAtKthPosition(Node head, int pos) {
		System.out.println("Delete Node at position : " + pos );
		Node temp = head;
		
		int count = 0;
		if(head == null) {
				return null;
		}
		while(temp != null) {
			count ++;
			 if(count == pos) {
				 break;
			 }
			 temp = temp.next;
		}
		
		Node front = temp.next;
		Node back = temp.prev;
		
		if(front == null) {
			back.next = null;
			temp.prev = null;
			return head;
		}else if(back == null) {
			head = head.next;
			temp.next = null;
			temp.prev = null;
			return head;
		}else{
			back.next = front;
			front.prev = back;
			temp.next = null;
			temp.prev = null;
			return head;
		}
		
	}
}
