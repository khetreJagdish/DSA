
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


public class StartingPointOfLoopInLL {
    public static Node firstNode(Node head) {
       

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
            return slow;
            }
        }

    return null;
    }
}

/****************************************************************
Slow and Fast Pointer Method

Approach:

The following steps are required:

Initially take two pointers, fast and slow. The fast pointer takes two steps ahead while the slow pointer will take a single step ahead for each iteration.
We know that if a cycle exists, fast and slow pointers will collide.
If the cycle does not exist, the fast pointer will move to NULL
Else, when both slow and fast pointer collides, it detects a cycle exists.
If they collide, move slow or fast pointer to head of LL (Point to the very first of the linked list).
Lets's consider we have moved slow to head and currently fast is at colliding position.
Move the slow and the fast pointer simultaneously ahead by single steps until they collide. 
Once they collide we get the starting node of the linked list. return either slow or fast.
 *****************************************************************/