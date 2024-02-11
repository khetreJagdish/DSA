package com.takeuforward.linkedlist;

public class RemoveNthNodeFromEndOfLLUsingSlowFastPointer {
	
	public static Node removeNthNodeFromEndOfLL(Node head, int k) {
		
		 if(head == null ){
		        return null;
		    }
		 
		 if(head.next == null) {
			 return head = head.next;
		 }

		
		//  take fast pointer pointing to head
			Node fast = head;
		//Now move fast pointer till kth position
		for(int i = 0; i<k;i++) {
			fast = fast.next;
		}
		
		  if (fast == null)
	            return head.next;
		
		// now take slow pointer , pointing to head
		Node slow = head;
		
		// move slow and fast simultaneously, till fast's next reaches null
		 while( fast.next != null){
		      slow = slow.next;
		      fast = fast.next;
		    }
		    slow.next = slow.next.next;
		    return head;
	}
}
