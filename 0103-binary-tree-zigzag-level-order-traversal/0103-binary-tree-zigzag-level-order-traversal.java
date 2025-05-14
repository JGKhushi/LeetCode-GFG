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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.offer(root);
        int level = 0 ;
        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.poll();
                
                if(level%2 == 0){
                    arr.add(curr.val);
                }else{
                    arr.add(0,curr.val);
                }

                if(curr.left != null){
                q.add(curr.left);
                }
                if(curr.right != null){
                q.add(curr.right);
                }
            }
        level++;
        ans.add(arr);
        }

       return ans; 
    }
}