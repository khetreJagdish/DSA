package com.takeuforward.linkedlist;

class Node1{
	int data;
	Node1 next;
	
	Node1(int data, Node1 next){
		this.data = data;
		this.next = next;
	}
	
	Node1(int data){
		this.data = data;
		this.next = null;
	}
}


public class LinkedListConversion {
		
	public static void main(String[] args) {
		
		int[] arr = {4,5,7,9};
		
		 Node1 head = new Node1(arr[0]);
		 Node1 mover = head;
		 
		 for(int i =1; i<arr.length;i++) {
			 System.out.println("Mover Next Value : " + mover.next);
			 Node1 temp = new Node1(arr[i]);
			 mover.next = temp;
			  mover = temp;
		 }
		 
		 System.out.println("Head Data : "+head.data);
		 System.out.println("Mover's Next : "+mover.next);
		 
		 
		 Node1 temp1 = head; 
		 int count = 0;
		 while(temp1 != null) {
			 System.out.println("Element "+ ++count +": "+temp1.data);
			 temp1 = temp1.next;
		 }
	}
	
	
}
