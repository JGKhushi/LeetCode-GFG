/**
 * Definition for singly-linked list.
 * public class ListListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1){
            return head;
        }
        ListNode temp = head;
        ListNode prevLast = null ;
        ListNode newHead = null;

        while(temp != null){
            ListNode kThListNode = temp ;
            int count  = 1;

            while(count < k && kThListNode != null){
                kThListNode = kThListNode.next ;
                count++;
            }

            if(kThListNode == null){
                if(prevLast != null){
                    prevLast.next = temp ;
                }
                break;
            }

            ListNode nextListNode = kThListNode.next;
            kThListNode.next = null;

            ListNode prev = null;
            ListNode curr = temp ;

            while(curr != null){
                ListNode front = curr.next ;
                curr.next = prev;
                prev = curr ;
                curr = front ;
            }

            if(newHead  == null){
                newHead = kThListNode ;
            }
            else{
                prevLast.next = kThListNode ;
            }

            prevLast = temp;
            temp = nextListNode ;

        }

        // return newHead != null ? newHead : head;
        return newHead;
    }
}