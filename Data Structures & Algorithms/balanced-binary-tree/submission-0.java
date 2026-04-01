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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int [] result = helper(root);
        if(result[0]==1){
            return true;
        }
        return false;
    }


    public int [] helper(TreeNode root){
       if(root == null){
           return new int[]{1,0};
       }

       int [] left = helper(root.left);
       int [] right = helper(root.right);

       boolean check = (left[0]==1 && right[0]==1 && Math.abs(left[1]- right[1])<=1);
       int height = 1 + Math.max(left[1], right[1]);
       
       if(check){
          return new int[]{1, height};
       }
       return new int[]{0, height};
    }
}
