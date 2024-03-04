import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

Time Complexity : O(N)
Space Complexity : O(N) --> due to recursion
*************************************************************/

public class AddOneToLLOptimizedUsingRecursion {
	public static Node addOne(Node head) {
		// Write your code here.
		Node temp = head;
		int carry  = helper(temp);
		
		if(carry == 1){
			Node newNode = new Node(carry);
			newNode.next = head;
			return newNode;
		}
	return head;
	}
	
	public static int helper(Node head){
		if(head == null){
			return 1;
		}
		int carry = helper(head.next);
		head.data = head.data+carry;
		if(head.data < 10){
			return 0;
		}
		
		temp.data = 0;
		return 1;
	}
}