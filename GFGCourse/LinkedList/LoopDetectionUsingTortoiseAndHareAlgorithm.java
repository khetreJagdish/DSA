public class LoopDetectionUsingTortoiseAndHareAlgorithm {

    //Using Tortoise and Hare Algorithm
    public static boolean detectCycle(Node head) {
        //Your code goes here

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            
            if(slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

// Time complexity : O(n)
//Space Complexity : O(1)