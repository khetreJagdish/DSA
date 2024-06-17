public class DeleteKthElementLinkedList{
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void print(Node head){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp =  temp.next;
		}
		
	}
	// Method to delete Kth Ellement
	public static Node deleteKthElement(Node originalHead, int k){
		
		// check if head is not null
		if(originalHead == null ){
			return null;
		}
		
		// check if node to deleted is 1
		// if yes then just move position ahead and return the head
		if(k == 1){
			originalHead = originalHead.next;
			return originalHead;
		}
		
		// Condition when k > 1
		Node head = originalHead;
		int count = 0;
		Node prev = null;
		while(head != null){
			count++;
			if(count == k){
				prev.next = prev.next.next;
				break;
			}
			prev = head;
			head = head.next;
			
		}
		
		return originalHead;
	}
	public static void main(String[] args){
		
		int[] arr = {3,4,5,6,7};
		int  k =4;
		if(arr.length < 1){
			System.out.println("LinkedList should contain atleast 1 Element");
			return;
		}
		
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i = 1; i<arr.length; i++){
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		System.out.println("Before deleting Kth Element :");
		print(head);
		System.out.println();
		Node afterKthHead = deleteKthElement(head,k	);
		System.out.println("After Kth Node Delete : ");
		print(afterKthHead);
		
	}

}