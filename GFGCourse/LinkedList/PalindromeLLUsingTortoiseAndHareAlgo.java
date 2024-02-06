 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }


public class PalindromeLLUsingTortoiseAndHareAlgo {
    public static boolean isPalindrome(Node head) {
        // write your code here
        if(head == null || head.next == null){
            return true;
        }
        // find middle of LL using Tortoise and Hare Algo

         Node slow = head;
         Node fast = head;

        while(fast.next != null && fast.next.next != null){
             slow = slow.next;
             fast = fast.next.next;
        }

         // so slow is currently standing at middle of LL
         // Now we will reverse the LL after middle node

        Node newHead = reverse(slow.next);
        Node first = head; 
        Node last = newHead;

        while(last != null){
            if(first.data != last.data){
                reverse(newHead);
                return false;
            }
            first = first.next;
            last = last.next;
        }
        reverse(newHead);
        return true;
    }

    static Node reverse(Node head){
        if(head == null ||  head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next  = head;
        head.next = null;
        return newHead;
    }
}