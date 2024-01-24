package com.takeuforward.doublylinkedlist;

public class ExecutionClass {
	
	public static void main(String[] args){
		int[] arr = {2,4,5,7,6,9,2,6};
		
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
