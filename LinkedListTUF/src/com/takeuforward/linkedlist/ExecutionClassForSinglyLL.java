package com.takeuforward.linkedlist;

public class ExecutionClassForSinglyLL {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		Node head = new Node(arr[0]);
		Node curr = head;
		
		for(int i = 1; i<arr.length; i++ ){
			Node newNode = new Node(arr[i]);
			curr.next = newNode;
			curr = curr.next;
		}
		
		
		/**********************************
		 *   print(head);
		     Node afterrecuriveReverse =ReverseLinkedListUsingRecursion.reverseLinkedListUsingRecursion(head);
		    print(afterrecuriveReverse);   
		 */
		
		/**********************************
		print(head);
		Node afterIterativeReverse =ReverseLinkedListIterative.reverseLinkedListIteratively(head);
		print(afterIterativeReverse);
		
	}
	*/
		/*
		print(head);
		Node afterIterativeReverse =OddEvenLinkedList.segregateOddEvenLL(head);
		print(afterIterativeReverse);
		*/

		print(head);
		Node afterIterativeReverse =RemoveNthNodeFromEndOfLL.removeNthNodeFromEndOfLL(head, 3);
		print(afterIterativeReverse);
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
