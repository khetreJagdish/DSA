package com.takeuforward.linkedlist;
import java.util.*;
import java.util.PriorityQueue;

public class MergeKList {
	
	// Function to merge k sorted linked lists
	static Node mergeKList(Node[] arr, int K) {
		
		// Priority_queue 'queue' implemented
        // as min heap with the help of
        // 'compare' function
		PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>(new NodeComparatorClass());
		Node at[] = new Node[K];
		Node head = new Node(0);
		Node last = head;
		
		for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
            	priorityQueue.add(arr[i]);
            }
        }
		
		 if (priorityQueue.isEmpty())
	            return null;
		 
		 while (!priorityQueue.isEmpty()) {
	            // Get the top element of 'queue'
	            Node curr = priorityQueue.poll();
	 
	            // Add the top element of 'queue'
	            // to the resultant merged list
	            last.next = curr;
	            last = last.next;
	            // Check if there is a node
	            // next to the 'top' node
	            // in the list of which 'top'
	            // node is a member
	            if (curr.next != null) {
	                // Push the next node of top node
	                // in 'queue'
	            	priorityQueue.add(curr.next);
	            }
	        }
		return head.next;
		
	}
}

class NodeComparatorClass implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		if(o1.data > o2.data) {
			return 1;
		}else if(o1.data < o2.data) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
