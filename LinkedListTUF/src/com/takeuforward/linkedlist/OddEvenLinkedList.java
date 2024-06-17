package com.takeuforward.linkedlist;

public class OddEvenLinkedList {
	
	public static  Node segregateOddEvenLL(Node head) {
		
		if(head == null || head.next ==null) {
			return head;
		}
		Node odd = head;
		Node even = head.next;
		 Node evenHead = head.next;
		 
		 while(even != null && even.next != null) {
			 odd.next = odd.next.next;
			 even.next = even.next.next;
			 odd = odd.next;
			 even = even.next;
		 }
		 odd.next = evenHead;
		 return head;
	}
	

}
