public class DeleteAllOccurancesOfGivenKeyinDLL {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.

        Node temp = head;

        while(temp != null){
            if(temp.data == k){

                if(temp == head){
                    head = head.next;
                }

                Node front = temp.next;
                Node back = temp.prev;

                if(front != null) front.prev = back;
                if(back != null) back.next = front;

                temp = temp.next;
            }else{
                temp = temp.next;
            }
        }
    return head;
    }
}