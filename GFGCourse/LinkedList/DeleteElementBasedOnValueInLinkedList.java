
 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 }

 

public class DeleteElementBasedOnValueInLinkedList
{
    public static Node removeKthNode(Node head, int value)
    {
        // Write your code here
			
			if(head == null){
				return head;
			}
			
			if(head.data == value){
				head = head.next;
				return head;
			}
			
			Node temp = head;
            Node prev = null;
            while(temp != null){
                
                if(temp.data == value){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        return head;
    }
	
	private static void print(Node head){
		while(head != null){
		  System.out.print(head.data+" ");
		  head = head.next;
	  }
	}
	
	public static void main(String[] args){
		int[] arr = {1,4,6,8,9,5};
		
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i = 1; i<arr.length;i++){
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
	  Node print = head;
	  System.out.println("LinkedList before Element Delete ");
	  print(print);
	  System.out.println();
		System.out.println("LinkedList after Element Delete ");
		Node finalHead = removeKthNode(head,1);
		print(finalHead);
		
	}

}
