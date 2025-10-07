/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int cnt =0 ;
        while(l1 != l2){
            if(l1 == null){l1 = headB; cnt++;}else{l1 = l1.next;}
            if(l2 == null){l2 = headA; cnt++;}else{l2 = l2.next;}
            if(cnt >= 3)return null;
        }    

        return l1;
    }
}