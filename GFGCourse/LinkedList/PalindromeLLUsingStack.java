public class PalindromeLLUsingStack {
    public boolean isPalindrome(Node head) {

        Node temp = head;
        Stack<Integer> stack = new Stack<Integer>();

        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
         temp = head;

         while(temp != null){
             if(temp.val != stack.peek()){
                 return false;
             }
             temp = temp.next;
             stack.pop();
         }
    return true;     
    }
}