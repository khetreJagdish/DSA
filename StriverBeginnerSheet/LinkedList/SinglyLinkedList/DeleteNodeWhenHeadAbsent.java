/**
    Note:

• The reference to the head of the linked list is not given.
• The node to be deleted is not a tail node.
• The value of each node in the Linked List is unique.
• It is guaranteed that the node to be deleted is present in the linked list.
**/


import java.io.*;
import java.util.* ;


class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }



public class DeleteNodeWhenHeadAbsent {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.

        if( node.next == null){
            return;
        }else{
            node.data = node.next.data;
            node.next =node.next.next;
        }
	}
}