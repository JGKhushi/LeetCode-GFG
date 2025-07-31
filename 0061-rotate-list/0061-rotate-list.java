class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length and last node
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Step 2: Make list circular
        tail.next = head;

        // Step 3: Find new tail (len - k % len steps from head)
        k = k % len;
        int stepsToNewTail = len - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle and return new head
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
