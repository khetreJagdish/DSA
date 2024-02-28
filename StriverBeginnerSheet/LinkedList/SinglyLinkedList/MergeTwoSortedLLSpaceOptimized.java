import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class MergeTwoSortedLLSpaceOptimized {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.

        LinkedListNode<Integer> temp1  = first;
        LinkedListNode<Integer> temp2  = second;

        LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> temp = dummy;

        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        if(temp1 != null){
            temp.next = temp1;
        }else{
            temp.next = temp2;
        }
    return dummy.next;
	}
}
