class Node{
	
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
	}
	
	Node(int data, Node next, Node prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}

public class DoublyLinkedList{
	
	static void print(Node temp){
		while(temp != null){
		  System.out.print(temp.data+" ");
		  temp = temp.next;
		}
	}
 	
	
	public static void main(String[] args){
		int[] arr = {2,4,5,7,6,9,2,6};
		
		Node head = new Node(arr[0]);
		Node back = head;
		
		for(int i = 1; i<arr.length; i++ ){
			
			Node temp = new Node(arr[i],null,back);
			back.next = temp;
			back = back.next;
		}
		
		print(head);
		
	}
	
}