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
   // Compare One-By-One (PQ)
public ListNode mergeKLists(ListNode[] lists) {
  if (lists == null || lists.length == 0) {
    return null;
  }
  ListNode dummy = new ListNode(-1);
  ListNode prev = dummy;

  PriorityQueue<ListNode> minPQ = new PriorityQueue<>((o1, o2) -> {
    return o1.val - o2.val;
  });

  // Init PQ
  for (int i = 0; i < lists.length; ++i) {
    if (lists[i] != null) {
      minPQ.offer(lists[i]);
    }
  }

  // Play with PQ
  while (minPQ.size() > 0) {
    ListNode curr = minPQ.poll();
    prev.next = curr;
    prev = prev.next; // update

    // you don't need to set curr.next as null since the last node is always be one of the last node of each list. Its next must be null.
    if (curr.next != null) {
      minPQ.offer(curr.next);
    }
  }
  
  return dummy.next;
}
}