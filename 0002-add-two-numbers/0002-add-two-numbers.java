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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1 ;
        ListNode temp2 = l2 ;
        ListNode ans = new ListNode(0);
        ListNode result = ans;

        int carry = 0 ;
        while(temp1 != null || temp2 != null ){
            int t1 =0 , t2 = 0;
            if(temp1 != null ) t1 = temp1.val;
            if(temp2 != null ) t2 = temp2.val;
            int sum = t1 + t2 + carry;
            ListNode nn = new ListNode();
            nn.val = sum % 10 ;
            ans.next = nn ;
            ans = ans.next ;
          
            if(sum > 9)carry = sum/10 ; 
            else carry = 0 ;

            if(temp1 != null)temp1 = temp1.next ;
            if(temp2 != null)temp2 = temp2.next ;            
        }

        if(carry > 0 ){
            ListNode nn = new ListNode();
            nn.val = carry;
            ans.next = nn ;
            ans = ans.next ;
        }

        return result.next;
    }
}