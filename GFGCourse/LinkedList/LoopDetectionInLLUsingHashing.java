import java.util.HashMap;
public class LoopDetectionInLLUsingHashing {

    // Using Hashing
    public static boolean detectCycle(Node head) {
        //Your code goes here

        Node temp = head;
        HashMap<Node,Integer> map = new HashMap<Node,Integer>();

        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }

            map.put(temp,1);
            temp = temp.next;
        }
    return false;
    }
}