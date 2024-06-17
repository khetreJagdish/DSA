public class RemoveDuplicatesFromSinglyLL {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node temp = head;
        while(temp != null && temp.next != null){
            
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }

        }
    return head;
    }
}