/****************************************************
	Following is the Node class for the Singly Linked List

		class LinkedListNode<Integer> {
			int data;
			LinkedListNode<Integer> next;

			public LinkedListNode(int data) {
				this.data = data;
			}
		}

****************************************************/
import java.util.*;
class NodeComparator implements Comparator<LinkedListNode<Integer>>{

	public int compare(LinkedListNode<Integer> node1, LinkedListNode<Integer> node2){
		if(node1.data > node2.data){
			return 1;
		}else if(node1.data < node2.data){
			return -1;
		}else{
			return 0;
		}
	}
}


public class MergeKSortedList {
    public static LinkedListNode<Integer> mergeKLists(LinkedListNode<Integer>[] listArray) {
        // Write your code here.

		PriorityQueue<LinkedListNode<Integer>> priorityQueue = new PriorityQueue<LinkedListNode<Integer>>(new NodeComparator());
		int K = listArray.length;
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(-1);	
		LinkedListNode<Integer> last = head;

		for (int i = 0; i < K; i++) {
            if (listArray[i] != null) {
            	priorityQueue.add(listArray[i]);
            }
        }

		if (priorityQueue.isEmpty())
	            return null;

		while(!priorityQueue.isEmpty()){
			LinkedListNode<Integer> curr = priorityQueue.poll();
			last.next = curr;
			last = last.next;

			if(curr.next != null){
				priorityQueue.add(curr.next);
			}
		}
	return head.next;
    }
}