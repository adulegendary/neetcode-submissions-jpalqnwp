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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //  TreeNode result = root;
        //  TreeNode curr = root;
        // System.out.println(result);
        return helper(root, val);
         //return root;
    }

    public TreeNode helper(TreeNode root, int val){
        if(root == null){
            
             return new TreeNode(val);
          //  System.out.println(root.val);
          
        }

        if(root.val > val){
           root.left = helper(root.left, val);
        }else {
           root.right= helper(root.right, val);
        }

        return root;
    }
}