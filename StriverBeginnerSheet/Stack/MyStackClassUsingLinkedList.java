public class MyStackClassUsingLinkedList{

	
	
	class Node{
		int data;
		Node node;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public MyStackClassUsingLinkedList(){
		
		int size = 0;
		Node head;
	}
	
	//push
	public Node push(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			head.next = newNode;
		}
	size++;
	return newNode;
	}
	
	
	
	//pop
	
	
	
	
	
	//peek
	
	
	
	
	//isFull
	
	
	
	
	
	//isEmpty
	
	
	
	
	//size
	
	
	public static void main(String[] args){
		
		MyStackClassUsingLinkedList list = new MyStackClassUsingLinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		
		while(list != null){
			System.out.print(" "+list.data);
			list = list.next;
		}
	
	}

}