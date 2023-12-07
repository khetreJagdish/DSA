package com.takeuforward.linkedlist;

class Node {
		
	int data;
	Node next;
	
	Node(int data, Node next){
		this.data = data;  // Data of current node
		this.next = next;  // refrence to the next Node
	}
	// this is the Last Node
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

public class LinkedList{
	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6};
		Node node2 = new Node(arr[0]);
		Node node1 = new Node(arr[1],node2);
		System.out.println(node1.data);
		System.out.println(node2.data);
	}
}
