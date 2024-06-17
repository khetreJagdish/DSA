package com.takeuforward.doublylinkedlist;
class Node
{
	int data;
	Node next;
	Node prev;
	
	Node(int d)
	{
		this.data = d;
	}
	
	Node(int d, Node next, Node prev)
	{
		this.data = d;
		this.next = next;
		this.prev = prev;
	}
}