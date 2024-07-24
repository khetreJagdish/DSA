
// Time complexity : O(N)
// Space complexity : O(1)
public class MinimumMaximumNumberofNodesBetweenCriticalPoints_Leetcode2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode  current = head.next;
        int count = 1;
        int firstCriticalNode = 0;
        int prevCriticalNode = 0;
        int minDist = Integer.MAX_VALUE;
        while(current.next != null){

            if((current.val > prev.val && current.val > current.next.val)
               || (current.val < prev.val && current.val < current.next.val))       {
                if(prevCriticalNode == 0){
                    prevCriticalNode = count;
                    firstCriticalNode = count;
                }else{
                    minDist = Math.min(minDist,count-prevCriticalNode);
                    prevCriticalNode = count;
                }
            }
            count++;
            prev = current;
            current = current.next;
        }

        if(minDist == Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[] {minDist, prevCriticalNode-firstCriticalNode};
    }
}