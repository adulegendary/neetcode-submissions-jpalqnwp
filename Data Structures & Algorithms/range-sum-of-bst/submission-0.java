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
    int total ;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        total =0;
        dfs(root, low, high);

        return total;
    }

    public void dfs(TreeNode root, int low, int high){
        if(root == null) return;

        dfs(root.left, low, high);
        dfs(root.right, low, high);

        if(root != null && root.val >= low && root.val <= high){
            total +=root.val;
        }

        return ;
    }
}