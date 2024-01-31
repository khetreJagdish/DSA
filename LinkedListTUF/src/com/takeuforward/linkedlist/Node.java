package com.takeuforward.linkedlist;
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		this.data = d;
	}
	
	Node(int d, Node next)
	{
		this.data = d;
		this.next = next;
	}
}