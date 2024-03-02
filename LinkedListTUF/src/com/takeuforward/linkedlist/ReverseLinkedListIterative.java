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
	
	 public static void printLinkedList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		// Create a linked list with values 1, 3, 2, and 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedListIteratively(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
	}
}
