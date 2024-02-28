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
 };


public class LengthOfLoopOfLLUsingTortoiseAndHareALgo
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                return findLengthOfLoop(slow,fast);

            }
        }
        return 0;
    }

   static int findLengthOfLoop(Node slow, Node fast){
        int count = 1;
        fast = fast.next;

        while(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
}