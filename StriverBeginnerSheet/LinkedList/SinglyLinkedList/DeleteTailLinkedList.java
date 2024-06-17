public class DeleteTailLinkedList{
	
	static class Node{
		int data;
		Node next;
		
		Node(int data, Node next){
			this.data = data;
			this.next = next;
	    }
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args){
		
		int[] arr = {2,5};
		if(arr.length<1){
			System.out.println("Please provide Valid Length LinkedList, should be greater than 1");
			return;
		}
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i = 1; i<arr.length; i++){
		  Node temp = new Node(arr[i]);
		  mover.next = temp;
		  mover = temp;
		}
		System.out.println("Before Tail Delete");
		print(head);
		Node afterDelete = deleteTail(head);
		System.out.println();
		System.out.println("After Tail Delete");
		print(afterDelete);
		
	}
	
	static void print(Node node){
	  while(node != null){
		System.out.print(node.data+" ");
		node  = node.next;
	  }
	}
	
	static Node deleteTail(Node originalHead){
		Node temp = originalHead;
		if(temp == null || temp.next == null){
			return null;
		}
		while(temp.next.next != null){
			temp = temp.next;
		}
		
		temp.next = null;
		return originalHead;
	}



}
