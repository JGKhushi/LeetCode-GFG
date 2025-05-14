class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively compute the maximum sum of the left and right subtree paths.
        int leftSum = Math.max(0, dfs(node.left));
        int rightSum = Math.max(0, dfs(node.right));

        // Update the maximum path sum encountered so far (with split).
        res = Math.max(res, leftSum + rightSum + node.val);

        // Return the maximum sum of the path (without split).
        return Math.max(leftSum, rightSum) + node.val;
    }    
}