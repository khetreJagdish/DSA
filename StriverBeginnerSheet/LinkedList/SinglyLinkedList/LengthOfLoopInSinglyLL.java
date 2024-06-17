
import java.util.HashMap;

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


public class LengthOfLoopInSinglyLL
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node temp = head;
        HashMap<Node,Integer> map = new HashMap();
        int timer= 1;
        while(temp != null){
            if(map.containsKey(temp)){
               Integer value =  map.get(temp);
                return timer - value;
            }

            map.put(temp,timer++);
            temp = temp.next;
        }
        return 0;
    }
}