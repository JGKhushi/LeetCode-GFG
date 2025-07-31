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

    // Reverse function (returns new head)
    public static ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, n;

        while (curr != null) {
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }

        return prev; // Correct return
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length of list
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k = k % len; // Reduce unnecessary full rotations
        if (k == 0) return head;

        // Step 2: Reverse full list
        head = reverse(head);

        // Step 3: Move to k-th node
        ListNode kThNode = head;
        for (int i = 1; i < k && kThNode != null; i++) {
            kThNode = kThNode.next;
        }

        // Step 4: Break and reverse two parts
        ListNode newNext = kThNode.next;
        kThNode.next = null;

        ListNode first = reverse(head);        // first k nodes
        ListNode second = reverse(newNext);    // remaining nodes

        // Step 5: Attach both parts
        ListNode tail = first;
        while (tail.next != null) tail = tail.next;
        tail.next = second;

        return first;
    }
}
