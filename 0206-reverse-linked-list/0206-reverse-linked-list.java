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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp; // Define temp outside the loop
        for (; head != null; head = temp) {
            temp = head.next; // Store the next node
            head.next = prev; // Reverse the link
            prev = head;      // Move prev to current node
        }
        return prev; // Return the new head of the reversed list
    }
}