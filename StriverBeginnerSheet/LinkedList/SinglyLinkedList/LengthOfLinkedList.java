/********************************************************************
 * Notes : 
We will take the use of a loop here.

Initially, we will make a node with a value equal to the first element of the array ‘Arr’.

Starting from the second element of the array, we will make a node with that value and will attach this node to the ‘next’ of the previous node. We will do this till the last element of the array.

At last, we will return the head node of the linked list.
 

The steps are as follows:-
 

// Function to implement Linked List From Array

function constructLL(int ‘arr[]’):

Let ‘N’ be the size of the array ‘arr’.
Create a node ‘head’, giving its value equal to ‘arr[0]’. Create another node, ‘temp’, initially assigned to ‘head’.
Iterate over the array ‘arr’ from index ‘1’ to index ‘N’ - 1:
Create a node ‘curNode’, giving its value equal to the current value of the array.
‘temp.next’ = ‘curNode’
‘temp’ = ‘temp.next’
Return ‘head’.
Time Complexity
O(N), Where 'N' is the size of the array ‘Arr’.

 

We will traverse each array index once. Hence, the time complexity is O(N).

Space Complexity
O(N), Where 'N' is the size of the array ‘Arr’.
 

We will take extra space for each element of the array. Hence, the space complexity is O(N).
 
 *********************************************************************/


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



 public class LengthOfLinkedList {
    public static Node constructLL(int []arr) {
        // Write your code here

        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        Node temp1 = head;

        while(temp1 != null){
            temp1 = temp1.next;
        }
        return head;

    }
}