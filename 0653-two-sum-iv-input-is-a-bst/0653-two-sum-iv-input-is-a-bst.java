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
class Solution {
    public boolean helper(TreeNode root , HashSet<Integer> hset ,int k ){
        if(root == null){
            return false;
        }
        if(hset.contains(k-root.val)) return true;
        hset.add(root.val);
        return helper(root.left , hset ,k)||
        helper(root.right ,hset , k);
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hset = new HashSet<>();

        return helper(root ,hset , k);

    }
}