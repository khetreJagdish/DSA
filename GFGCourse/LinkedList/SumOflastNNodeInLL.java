public class SumOflastNNodeInLL {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      
      int count = 0;
      Node temp = head;
      int N = lengthCount(head);
      int sum = 0;
      while(temp != null){
          count++;
          
          if(count > (N-k)){
              sum = sum + temp.data;
          }
          
          temp = temp.next;
      }
      return sum;
    }
    
    int lengthCount(Node head){
        
         Node temp = head;
         int count = 0;
         while(temp != null){
             count++;
             temp = temp.next;
         }
         return count;
    }
}