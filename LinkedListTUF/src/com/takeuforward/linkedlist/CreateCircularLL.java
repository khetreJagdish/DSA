package com.takeuforward.linkedlist;

public class CreateCircularLL {
	
	public static void main(String[] args) {
		
		int[] arr = {3};
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i = 1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		mover.next = head;
		
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print (temp.data+" ");
	}
}
