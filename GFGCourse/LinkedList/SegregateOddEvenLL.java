/*
	Approach : 
	  1) first we will copy all the odd position index elements to one ArrayList
	  2) Then add/append all even position index elements to same ArrayList
	  3) then replace all the elements from same ArrayList to given LinkedList 
	  4) finally return head
	  
	  Time complexity : O(N)
	  Space Complexity : O(N)

*/

import java.util.ArrayList;
public class SegregateOddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        

        if(head == null || head.next == null){
            return head;
        }

        ListNode  temp =head;
        List<Integer> list = new ArrayList();
        while(temp != null && temp.next != null){
            list.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null){
            list.add(temp.val);
        }

        temp = head.next;

        while(temp != null && temp.next != null){
            list.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null){
            list.add(temp.val);
        }

         temp = head;
        int i =0;
        while(temp != null){
            temp.val = list.get(i);
            i++;
            temp= temp.next;
         }
    return head;
    }
}