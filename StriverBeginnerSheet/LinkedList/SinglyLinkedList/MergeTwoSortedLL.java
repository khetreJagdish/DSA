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
/**
	Intution : 
		1) add Elements from both LinkedList in one ArrayList 
		2) Sort the ArrayList
		3) Create another LinedList with the data from ArrayList
		4) return dummy.next node as Head
**/


public class MergeTwoSortedLL {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> temp1 =  first;
        LinkedListNode<Integer> temp2 =  second;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(temp1 != null){
            list.add(temp1.data);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            list.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(list);

        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode temp = dummy;

        for(int i = 0; i<list.size(); i++){
            LinkedListNode tempNode = new LinkedListNode(list.get(i));
            temp.next = tempNode;
            temp = temp.next;
        }
    return dummy.next; 
	}
}
