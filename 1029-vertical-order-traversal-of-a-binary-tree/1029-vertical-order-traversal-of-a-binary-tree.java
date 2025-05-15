/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class NodePosition {
    TreeNode node;
    int row;
    int col;
    NodePosition(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map to store nodes by their column and row positions
        // Outer TreeMap: columns (sorted from left to right)
        // Inner TreeMap: rows (sorted from top to bottom)
        // PriorityQueue: nodes at same position sorted by value
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> columnMap = new TreeMap<>();
        
        // Queue for BFS traversal
        Queue<NodePosition> queue = new LinkedList<>();
        queue.offer(new NodePosition(root, 0, 0));
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                NodePosition current = queue.poll();

                // Initialize data structures if they don't exist
                columnMap.putIfAbsent(current.col, new TreeMap<>());
                columnMap.get(current.col).putIfAbsent(current.row, new PriorityQueue<>());
                
                // Add node value to its position
                columnMap.get(current.col).get(current.row).add(current.node.val);

                // Process left child (next row, column to the left)
                if(current.node.left != null) {
                    queue.offer(new NodePosition(current.node.left, current.row + 1, current.col - 1));
                }
                
                // Process right child (next row, column to the right)
                if(current.node.right != null) {
                    queue.offer(new NodePosition(current.node.right, current.row + 1, current.col + 1));
                }
            }
        }
        
        // Prepare the final result
        List<List<Integer>> result = new ArrayList<>();
        
        // Process each column from left to right
        for(TreeMap<Integer, PriorityQueue<Integer>> rowMap : columnMap.values()) {
            List<Integer> columnValues = new ArrayList<>();
            
            // Process each row from top to bottom
            for(PriorityQueue<Integer> nodeValues : rowMap.values()) {
                // Add all values at this position (sorted by PriorityQueue)
                while(!nodeValues.isEmpty()) {
                    columnValues.add(nodeValues.poll());
                }
            }
            
            result.add(columnValues);
        }
        
        return result;
    }
}