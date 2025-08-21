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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreOrder(preorder , Integer.MAX_VALUE , new int[]{0});
    }
    public TreeNode bstFromPreOrder(int[] A , int bound , int[] i){
        if(i[0] == A.length  || A[i[0]] > bound){
            return null;
        }
        TreeNode root = new TreeNode(A[i[0]++]);
        root.left = bstFromPreOrder(A , root.val , i);
        root.right = bstFromPreOrder(A , bound , i);
        return root;
    }
}