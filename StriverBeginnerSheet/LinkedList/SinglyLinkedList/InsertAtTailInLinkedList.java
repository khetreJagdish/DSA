class Node {
	
	int data;
	Node next;
	
	Node(int data){
	   this.data = data;
	   this.next = null;
	}
	
	Node(int data,Node next){
	   this.data = data;
	   this.next = next;
	}

}

public class InsertAtTailInLinkedList{
	
	
	
	private static Node insertAtTail(Node headNode,int val){
		
		Node temp = headNode;
		
		while(temp.next != null){
			temp = temp.next;
			
		}
		temp.next = new Node(val);
		return headNode;
	}
	
	private static void print(Node modifiedHead){
		Node temp = modifiedHead;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args){
	
		int[] arr = {4,5,6,8,2,45,62,87};
		
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i = 1; i<arr.length; i++){
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
	    
		System.out.println("Before Insertion at Tail");
		print(head);
		Node modifiedHead = insertAtTail(head,100);
		System.out.println();
		System.out.println("After insertion at Tail");
		print(modifiedHead);
	}


}