package com.takeuforward.linkedlist;

class Node2 {
		
	int data;
	Node2 next;
	
	Node2(int data, Node2 next){
		this.data = data;  // Data of current node
		this.next = next;  // refrence to the next Node
	}
	// this is the Last Node
	Node2(int data){
		this.data = data;
		this.next = null;
	}
	
}

public class LinkedList{
	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6};
		Node2 node2 = new Node2(arr[0]);
		Node2 node1 = new Node2(arr[1],node2);
		System.out.println(node1.data);
		System.out.println(node2.data);
	}
}
