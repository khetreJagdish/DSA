package com.takeuforward.linkedlist;
class DLLNode
{
	int data;
	DLLNode next;
	DLLNode prev;
	
	DLLNode(int d)
	{
		this.data = d;
	}
	
	DLLNode(int d, DLLNode next,DLLNode prev)
	{
		this.data = d;
		this.next = next;
		this.prev = prev;
	}
}