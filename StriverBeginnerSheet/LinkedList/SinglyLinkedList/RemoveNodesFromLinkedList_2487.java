public class RemoveNodesFromLinkedList_2487 {
    public ListNode removeNodes(ListNode head) {

        Stack<Integer> stack = new Stack();
        ListNode current = head;

        while(current != null){
            stack.push(current.val);
            current = current.next;
        }

        int currentValue = stack.pop();
        int maxNode = currentValue;
        ListNode resultHead = new ListNode(currentValue);

        while(!stack.isEmpty()){
            currentValue = stack.pop();
            if(currentValue < maxNode){
                continue;
            }else{
                ListNode newNode = new ListNode(currentValue);
                newNode.next = resultHead;
                resultHead = newNode;
                maxNode = currentValue;
            }
        }
    return resultHead;
        
        
    }
}