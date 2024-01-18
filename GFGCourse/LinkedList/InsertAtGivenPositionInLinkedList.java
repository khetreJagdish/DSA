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

public class InsertAtGivenPositionInLinkedList{
	
	
	static int calLength(Node head){
		 Node temp = head;
		 int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	
	private static Node insertAtPosition(Node headNode,int position,int val){
		
		
		int length = calLength(headNode);
		
		if(position<1 || position > length+1){
			System.out.println("Invalid Range");
			return headNode;
		}
		
		
		if(position == 1){
			return new Node(val,headNode);
		}
		
		
		Node temp = headNode;
		Node prev = null;
		int count = 0;
		while(temp != null){
			count++;
			if(count == position){
				prev.next = new Node(val,temp);
				return headNode;
			}
			prev = temp;
			temp = temp.next;
		}
		if(position == length+1){
			Node newNode = new Node(val,null);
			prev.next = newNode;
			return headNode;
		}
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
	    
		System.out.println("Before Insertion at Given position");
		print(head);
		System.out.println();
		Node modifiedHead = insertAtPosition(head,10,100);
		System.out.println();
		System.out.println("After insertion at Given position");
		print(modifiedHead);
	}


}