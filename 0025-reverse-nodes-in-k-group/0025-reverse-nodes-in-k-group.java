class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        
        while (true) {
            // Check if there are at least k nodes remaining
            ListNode kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) break;
            
            ListNode nextGroupStart = kthNode.next;
            ListNode groupStart = prevGroupEnd.next;
            
            // Reverse the current k-group
            ListNode prev = nextGroupStart;
            ListNode curr = groupStart;
            
            while (curr != nextGroupStart) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            // Connect the previous group to the reversed group
            prevGroupEnd.next = kthNode; // kthNode is now the start of reversed group
            prevGroupEnd = groupStart; // groupStart is now the end of reversed group
        }
        
        return dummy.next;
    }
    
    private ListNode getKthNode(ListNode start, int k) {
        ListNode curr = start;
        for (int i = 0; i < k; i++) {
            if (curr == null) return null;
            curr = curr.next;
        }
        return curr;
    }
}