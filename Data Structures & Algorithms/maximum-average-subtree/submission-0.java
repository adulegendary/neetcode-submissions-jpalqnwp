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
    double ans;
    public double maximumAverageSubtree(TreeNode root) {
          ans = 0.0;
          dfs(root);
          return ans;
    }

    public int[] dfs(TreeNode root){
        if(root == null){
             return new int[]{0, 0};
        }

        int []lefSide = dfs(root.left);
        int []rightSide = dfs(root.right);
        
        int totalvalue = lefSide[0] + rightSide[0] + root.val;
        int counter = lefSide[1] + rightSide[1] + 1;
        double values = (double)totalvalue/(double)counter;
        ans = Math.max(ans, values);

        return new int[]{totalvalue, counter};
    }
}