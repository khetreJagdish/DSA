public class InsertNodeAtHead {
	
	public static Node insertAtHeadOfDLL(Node head,int element) {
		
		if(head == null) {
			Node newNode = new Node(element);
			return newNode;
		}
				
		Node newNode = new Node(element,head,null);
		head.prev = newNode;
		return newNode;
	} 
	
}