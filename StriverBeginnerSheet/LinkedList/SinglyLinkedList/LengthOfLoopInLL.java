public class LengthOfLoopInLL
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
              return  findLengthOfLoop(slow,fast);
            }
        }
    return 0;
    }

    public static int findLengthOfLoop(Node slow, Node fast){

        int count = 1;
        fast= fast.next;

        while(slow != fast){
            count ++;
            fast = fast.next;
        }
    return count;
    }
}