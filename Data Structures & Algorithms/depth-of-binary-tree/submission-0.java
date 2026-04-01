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
    public int maxDepth(TreeNode root) {
        int result =0;
        if(root == null){
            return result;
        }
        return helper(root,result);

    }
   public int helper(TreeNode root, int current){
        if(root == null){
            return current;
        }

        int leftSide = helper(root.left, current + 1);
         //helper(root.left,  current++);
        int rightSide = helper(root.right,  current +1);

        return Math.max(leftSide, rightSide);

    }
}