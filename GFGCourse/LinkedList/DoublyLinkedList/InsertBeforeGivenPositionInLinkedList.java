
public class InsertBeforeGivenPositionInLinkedList {
		
	static Node insertBeforeGivenPositionInDLL(Node head,int element,int pos) {
		
		Node temp = head;
		
		int length = 0;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		
		if(pos < 1 || pos > length) {
			System.out.println("Invalid Position ");
			return null;
		}
		
		if(pos == 1) {
			return InsertNodeAtHead.insertAtHeadOfDLL(head, element);
		}
		
		
		
		int count = 0;
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
