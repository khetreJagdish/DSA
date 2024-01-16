package com.takeuforward.linkedlist;

public class ArrayToLinkedListConversionUsingNestedStaticClass {
	
	 static class Node{
		 int data;
		 Node next;
		 
		 Node(int data, Node next){
			 this.data = data;
			 this.next = next;
		 }
		 
		 Node(int data){
			 this.data = data;
			 this.next = null;
		 }
		 
	 } 
	
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,7};
		
	  Node head = convertArrayToLL(arr);
	  
	  System.out.println(head.data);
		 
	}



	private static Node convertArrayToLL(int[] arr) {
		
	 Node head = new Node(arr[0]);
	 Node mover = head;
	 
	 for(int i = 1; i<arr.length; i++) {
		 Node temp = new Node(arr[i]);
		 mover.next = temp;
		  mover = temp;
	 }
		return head;
	}
}
