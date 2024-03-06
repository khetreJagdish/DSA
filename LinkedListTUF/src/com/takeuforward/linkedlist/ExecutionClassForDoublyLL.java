package com.takeuforward.linkedlist;

import java.util.ArrayList;

public class ExecutionClassForDoublyLL {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,9,10};
		
		
		DLLNode head = new DLLNode(arr[0]);
		DLLNode curr = head;
		
		for(int i = 1; i<arr.length; i++ ){
			DLLNode newNode = new DLLNode(arr[i],null,curr);
			curr.next = newNode;
			curr = curr.next;
		}
		
		print(head);
		ArrayList<int[]> val =FindPairWithGivenSum.findPairs(head,5);
		for(int[] arr1  : val) {
			for(int i : arr1) {
				System.out.println(i);
			}
		}
	}
	
	public static void print(DLLNode head) {
		DLLNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
