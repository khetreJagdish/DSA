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

public class InsertBeforeValueGiven{
	
	private static Node insertBeforeValueGiven(Node headNode,int val,int element){
		
		if(headNode == null){
			System.out.println("Invalid Head, head can't  be null");
			return headNode;
		}
		
		if(headNode.data == val){
			return new Node(element,headNode);
		}
		
		Node temp = headNode;
		Node prev = null;
		while(temp != null){
			if(temp.data == val){
				Node newNode = new Node(element,temp);
				prev.next = newNode;
				return headNode;
			}
			prev = temp;
			temp = temp.next;
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
	    
		System.out.println("Before Insertion at Given value");
		print(head);
		System.out.println();
		Node modifiedHead = insertBeforeValueGiven(null,87,10);
		System.out.println();
		System.out.println("After insertion at Given position");
		print(modifiedHead);
	}


}