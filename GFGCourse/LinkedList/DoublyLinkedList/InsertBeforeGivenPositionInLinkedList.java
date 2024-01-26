public class InsertBeforeGivenPositionInLinkedList {
		
	static Node insertBeforeGivenPositionInDLL(Node head,int element,int pos) {
		
		Node headNode = head;
		
		int length = 0;
		while(headNode != null) {
			length++;
			headNode = headNode.next;
		}
		
		if(pos < 1 || pos > length) {
			System.out.println("Invalid Position ");
			return null;
		}
		
		if(pos == 1) {
			return InsertNodeAtHead.insertAtHeadOfDLL(head, element);
		}
		
		
		
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			if(count == pos) break;
			temp = temp.next;
		}
		
		Node back = temp.prev;
		Node newNode = new Node(element,temp,back);
		back.next = newNode;
		temp.prev = newNode;
		return head;
	}
	
}
