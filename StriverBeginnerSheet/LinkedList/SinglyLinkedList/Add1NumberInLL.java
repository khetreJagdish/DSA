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
	
	Time Complexity : O(3N)
	Space Complexity : O(1)
*************************************************************/

public class Add1NumberInLL {
	
	public static Node addOne(Node head) {
	
	//Step 1 : reverse LinkedList
	head = reverse(head);                          // O(N)
	
	//Step 2 : Assign 1 to carry
	int carry = 1;
	
	//Step 3 : Assign head to temp
	Node temp = head;
	
	//Step 4 : Initialize While loop
	while(temp != null){										// O(N)
	
		// Step 5 : Add carry first time to temp.data
		temp.data = temp.data+carry;
		
		//Step 6: check if temp.data is less than 10
		if(temp.data < 10){
		  carry = 0;
 		  break;
		}else{
		  carry = 1;
		  temp.data  = 0;
		}
		temp = temp.next;
	}

if(carry == 1){
	Node newNode = new Node(carry);
	head = reverse(head);                           // O(N)
	newNode.next = head;
	return newNode;
}

head = reverse(head);
return head;
		
}




public static Node reverse(Node head){
	
	Node prev = null; 
	Node temp = head;

	while(temp != null){
	  Node front = temp.next;
	  temp.next = prev;
	  prev = temp;
          temp = front;
	}
  return prev;
}

}