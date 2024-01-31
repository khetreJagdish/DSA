package com.takeuforward.linkedlist;

public class ExecutionClassForSinglyLL {
	
	public static void main(String[] args){
		int[] arr = {2,4,5,7};
		
		Node head = new Node(arr[0]);
		Node curr = head;
		
		for(int i = 1; i<arr.length; i++ ){
			Node newNode = new Node(arr[i]);
			curr.next = newNode;
			curr = curr.next;
		}
		
		print(head);
		Node afterrecuriveReverse =ReverseLinkedListUsingRecursion.reverseLinkedListUsingRecursion(head);
		print(afterrecuriveReverse);
		
		
		/**********************************
		 *  
		 *  
		 *  
		 *  
		 */
		
		
		
			
	}
	
	public static void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
