package com.takeuforward.linkedlist;

public class RemoveNthNodeFromEndOfLL {
	
	public static Node removeNthNodeFromEndOfLL(Node head, int k) {
		
		if(head == null) {
			return head;
		}
		
		Node temp = head;
		int length = 0;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		
		if(length == k) {
			head = head.next;
			return head;
		}
		
		temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			
			if(count == length-k) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
}
