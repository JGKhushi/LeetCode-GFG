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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0 ; i< nums.length ; i++){
            hset.add(nums[i]);
        }

        while(head != null && hset.contains(head.val)){
            head = head.next ;
            if(head == null){
        return null;
       }
        }

        ListNode curr = head ;
        while(head.next != null){
            if(hset.contains(head.next.val)){
                head.next = head.next.next ;
            }else{
                head = head.next ;
            }
        }

        return curr ;
    }
}