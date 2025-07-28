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

    public static ListNode divide(ListNode head){
         if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head , fast = head , prev = null;

        while(fast != null && fast.next != null){
            prev  = slow ;
            slow = slow.next ;
            fast= fast.next.next;
        }
            if(prev != null){
            prev.next = null;
            }
         return slow;
            }

    public static ListNode merge(ListNode left , ListNode right){
        ListNode temp = new ListNode(0);
        ListNode prev = temp ;

        while(left != null && right != null){
            if(left.val < right.val){
                prev.next = left ;
                left = left.next;
            }
            else{
                prev.next = right ;
                right = right.next; 
            }

            prev = prev.next;
        }

        if(left != null){
            prev.next = left;
        }
        else{
            prev.next = right ;
        }

        return temp.next;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        // divide 
         ListNode mid = divide(head);
         ListNode right = sortList(mid);
         ListNode left = sortList(head);
         
        



        // compare and merge
        return merge(left , right );
    }
}