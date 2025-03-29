/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null ){
            return null;
        }
        int size = 0;
        ListNode curr = head ;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        
         curr = head;
        int remove = size - n + 1  ;
        if(remove == 1){
            return head.next;
        }
        while(remove-- > 2){
             curr = curr.next;
        }
        curr.next = curr.next.next;

     
        return head;
    }
}