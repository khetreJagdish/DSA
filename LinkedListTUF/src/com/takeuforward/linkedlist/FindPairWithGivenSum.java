package com.takeuforward.linkedlist;

import java.util.ArrayList;

public class FindPairWithGivenSum {

    public static ArrayList<int[]> findPairs(DLLNode head, int k) {
        // Write your code here.

        DLLNode temp1 = head;
        ArrayList<int[]> list = new ArrayList<>();
        while(temp1 != null){
            DLLNode temp2 = temp1.next;

            while(temp2 != null){
                if(temp1.data+temp2.data == k){
                    list.add(new int[]{temp1.data,temp2.data});
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return list;


    }

}