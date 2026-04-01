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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int []result = new int[1]; 
        helper(root, result);
        return result[0];


    }

    public int helper(TreeNode root, int [] counter){
           if(root == null){
               return 0;
           }
           int left = helper(root.left, counter);
           int right = helper(root.right, counter);
           
           counter[0] = Math.max(counter[0], left + right) ;
           
           return 1 + Math.max(left,right);
    }
}
