


import java.util.Stack;
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


public class LinkedListReverseUsingStack
{
    public static Node reverseLinkedList(Node head)
    {
        Stack<Integer> stack = new Stack<Integer>();

        Node temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            temp.data = stack.peek();
            stack.pop();
            temp = temp.next;
        }        

    return head;        

    }
}

    /******************************************************************************
    To Reverse a LinkedList , we can reverse the data of each node but to store  that data we need to store it somewhere 
	and when we fetch that we can get it in Reverse order.
	One Data structure comes in mind is Stack.

	Steps I :
	so we will add all the Node data in Stack.

	Step II : 
	As Stack has property LIFO because of that we will pick up the first Element from Stack (which will be our LinkedList's Last element) and assign it to our LinkedList's head. 
	then mover pointer to next element.
  
	Time Complexity Analysis:

	The first while loop iterates through each node of the linked list and pushes the data of each node onto the stack. Since there are 'n' nodes in the linked list, this operation takes O(n) time.
	The second while loop also iterates through each node of the linked list. Inside this loop, there are constant time operations such as stack operations (pop, peek), assigning data to nodes. Since this loop also iterates 'n' times, its time complexity is O(n).
	Therefore, the total time complexity of the function is O(n).

	Space Complexity Analysis:

	The space complexity of the function depends on the extra space used by the stack.
	In the worst case, the stack will hold all the 'n' elements of the linked list.
	Hence, the space complexity of the function is O(n) due to the stack.
	In summary:

	Time complexity: O(n)
	Space complexity: O(n) 
		
    *******************************************************************************/