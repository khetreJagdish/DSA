package com.takeuforward.doublylinkedlist;

public class ExecutionClass {
	
	public static void main(String[] args){
		int[] arr = {2,4,5,7};
		
		Node head = new Node(arr[0]);
		Node back = head;
		
		for(int i = 1; i<arr.length; i++ ){
			Node temp = new Node(arr[i],null,back);
			back.next = temp;
			back = back.next;
		}
		
		/*===================================*/
		//Node afterDeleteHead = DeleteNodeAtHead.deleteNodeAtHead(head);
		//print(afterDeleteHead);
		/*===================================*/
		
		/*===================================*/
		//print(head);
		//Node afterDeleteHead = DeleteNodeAtTail.deleteNodeAtTail(head);
		//print(afterDeleteHead);
		/*===================================*/
		
		/*===================================*/
		//print(head);
		//Node afterDeleteAtKth = DeleteNodeAtKthPosition.deleteNodeAtKthPosition(head, 3);
		//print(afterDeleteAtKth);
		/*===================================*/
		
		/*===================================*/
		//print(head);
		//Node afterInsertionatHead = InsertNodeAtHead.insertAtHeadOfDLL(head, 10);
		//print(afterInsertionatHead);
		/*===================================*/
		
		/*===================================*/
		print(head);
		Node insertBeforeKthNode = InsertBeforeGivenPositionInLinkedList.insertBeforeGivenPositionInDLL(head, 10, 5);
		print(insertBeforeKthNode);
		/*===================================*/
		
		
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
