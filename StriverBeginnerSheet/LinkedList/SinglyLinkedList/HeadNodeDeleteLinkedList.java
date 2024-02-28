public class HeadNodeDeleteLinkedList {
    
    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static Node deleteHead(Node head){
        if(head != null){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9};

        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        Node previousHead = head;
        System.out.println("Before Deleteion of Head");
        print(previousHead); 
        System.out.println();
        System.out.println("After Deleteion of Head");
        Node afteDeleteHead =deleteHead(head);
        print(afteDeleteHead);
    }

    private static void print(Node previousHead) {
        while(previousHead != null){
            System.out.print(previousHead.data+" ");
            previousHead = previousHead.next;
        }
    }
}
