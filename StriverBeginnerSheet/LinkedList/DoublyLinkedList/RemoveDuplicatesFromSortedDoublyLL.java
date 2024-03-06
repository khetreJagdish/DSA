/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class RemoveDuplicatesFromSortedDoublyLL {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.

        Node temp = head;

        while(temp != null && temp.next != null){
            Node nextNode = temp.next;

            while(nextNode != null && temp.data == nextNode.data){
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if(nextNode != null) nextNode.prev = temp;

            temp = temp.next;
        }
    return head;
    }
}