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

public class DoublyLinkedListTailDelete{
	
	static void print(Node temp){
		while(temp != null){
		  System.out.print(temp.data+" ");
		  temp = temp.next;
		}
	}
	
	private static Node deleteTail(Node head){
		
		if(head == null || head.next == null){
			return null;
		}
		
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		Node back = temp.prev;
		back.next = null;
		temp.prev = null;
		return head;
	}
 	
	
	public static void main(String[] args){
		int[] arr = {};
		
		if(arr.length < 1){
			System.out.println("Enter valid number of Elements, Elements can not be less than 1 ");
			return;
		}
		Node head = new Node(arr[0]);
		Node back = head;
		
		for(int i = 1; i<arr.length; i++ ){
			
			Node temp = new Node(arr[i],null,back);
			back.next = temp;
			back = back.next;
		}
		Node newHead = deleteTail(head);
		print(newHead);
		
	}
	
}