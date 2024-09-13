public class DeleteNodesFromLinkedListPresentInArray
 {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer>  hashSet = new HashSet<>(); 
        for(int i = 0; i< nums.length; i++){
            hashSet.add(nums[i]);
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode mover = dummyNode;
        ListNode temp = head;

        while(temp != null){

            if(!hashSet.contains(temp.val)){
                mover.next = temp;
                mover = mover.next;
            }
            temp = temp.next;
        }
        mover.next = null;
    return dummyNode.next;
    }
}