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
        ListNode ans = new ListNode();
        ListNode start = ans;
        int carry = 0;
        ListNode A = l1;
        ListNode B = l2;
        int sum = 0 ;
        

        while(A != null && B!= null){
            sum = A.val + B.val + carry;
            if(sum < 10){
                ans.val = sum ;
                sum = 0;
                carry = 0;
            }
            else{
                carry = 1 ;
                 ans.val  = sum % 10 ;
                 sum = 0;
            }
           if(A.next != null || B.next != null){
           ans.next = new ListNode();
           ans = ans.next;
           }
           

            A = A.next;
            B = B.next;

        }
       
            while(A != null){
              sum = A.val + carry;
            if(sum < 10){
                ans.val = sum ;
                sum = 0;
                 carry = 0;
            }
            else{
                carry = 1 ;
                 ans.val  = sum % 10 ;
                 sum = 0;
            }
           if(A.next != null ){
           ans.next = new ListNode();
           ans = ans.next;
           }
           

            A = A.next;
           
            }
            
        
        while(B != null){
            sum = B.val + carry;
            if(sum < 10){
                ans.val = sum ;
                sum = 0;
                carry = 0;
            }
            else{
                carry = 1 ;
                 ans.val  = sum % 10 ;
                 sum = 0;
            }
           if( B.next != null){
           ans.next = new ListNode();
           ans = ans.next;
           }
        
            B = B.next;
        }

    if(carry == 1 && A == null && B== null){
        ans.next = new ListNode(1);
    }
        return start;
    }
}