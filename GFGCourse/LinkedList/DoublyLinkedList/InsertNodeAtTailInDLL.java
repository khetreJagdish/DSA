public class InsertNodeAtTailInDLL
{
    public static Node insertAtTail(Node list, int K) {
        // Write your code here

        Node temp = list;

        if(temp == null){
            Node newNode = new Node(K);
            return newNode;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        Node newNode = new Node(K,null,temp);
        temp.next = newNode;
        return list;
    }
}