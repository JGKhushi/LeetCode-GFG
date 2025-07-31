class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        ListNode newHead = null;

        while (temp != null) {
            // Step 1: Check if at least k nodes remain from temp
            ListNode kThNode = temp;
            int count = 1;
            while (count < k && kThNode != null) {
                kThNode = kThNode.next;
                count++;
            }

            // If there are less than k nodes left, don't reverse
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            // Step 2: Store the next group's head and break the current group
            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            // Step 3: Reverse the current group
            ListNode prev = null;
            ListNode curr = temp;
            while (curr != null) {
                ListNode front = curr.next;
                curr.next = prev;
                prev = curr;
                curr = front;
            }

            // Step 4: Connect previous group's tail to new head of reversed group
            if (newHead == null) {
                newHead = kThNode; // First group becomes new head
            } else {
                prevLast.next = kThNode;
            }

            // Step 5: Update prevLast and move temp to next group
            prevLast = temp;
            temp = nextNode;
        }

        return newHead != null ? newHead : head;
    }
}
