/**
	Approach : 
		1) Every time we will start our head from head.next because our head.val == 0
		2) Also temp will start from head.next;
		i.e. both pointer will start from same Node i.e. head.next
		3) create one sum variable which will do sum of all Node's value between two zeroes
		4) move temp from starting zero till ending zero 
		5) if the value of the temp.val == 0 , will exit the loop and assign sum's value to head.val
		6) for head.next do the same process using recursion
		7) return head
**/

public class MergeNodesInBetweenZeros_UsingRecursion_Leetcode_2181 {
    public ListNode mergeNodes(ListNode head) {
        
        head = head.next;
        if(head == null) return head;
        ListNode temp = head;

        int sum = 0;

        while(temp != null && temp.val != 0){
            sum += temp.val;
            temp = temp.next;
        }
		

        head.val = sum;
        head.next = mergeNodes(temp);
        return head;
    }
}