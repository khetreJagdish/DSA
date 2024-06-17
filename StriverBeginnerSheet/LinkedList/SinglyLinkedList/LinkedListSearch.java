
/*
 * 
 * Iterative Approach
The idea is to first initialize a pointer pointing to the first element of the Linked List and will check if the pointer's data is equal to the desired value ‘K’. If yes, then we will return 1; otherwise, we will move the pointer ahead by 1 position. If at any point of time during our travel, the pointer gets to point the NULL node, i.e., the end of Linked List, we will return 0 (as we have reached the end).

Time Complexity
O(N), where ‘N’ is the number of nodes in the Linked List.
 

We are doing only a single traversal of the Linked List, which takes O(N) in the worst case. Hence the overall complexity will be O(N).

Space Complexity
O(1).
 

In the worst case, a constant space is required.
 * 
 * 
 * 
 */


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



 public class LinkedListSearch
 {
     public static int searchInLinkedList(Node head, int k)
     {
         // Write Your Code Here.
         Node temp = head;
         while(temp != null){
             if(temp.data == k){
                 return 1;
             }
             temp = temp.next;
         }
         return 0;
     }
 }