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
    int ans;
    public int longestConsecutive(TreeNode root) {
        
        ans =0;
        dfs(root);
        return ans;
        
    }

    public int dfs(TreeNode root){
           if(root == null){
               return 0;
           }
        

           int leftSide = dfs(root.left);
           int rightside = dfs(root.right);
           
           int lastNode = 1;
           if(root.left !=null && root.left.val +1 == root.val ){
              lastNode = Math.max(leftSide+1, lastNode);
           }
              if(root.right !=null && root.right.val +1 == root.val){
              lastNode = Math.max(rightside + 1, lastNode);
           }

           int decreasing =1;
           if(root.left !=null && root.left.val -1 == root.val){
              decreasing = Math.max(decreasing, leftSide + 1);
           }
            if(root.right !=null && root.right.val -1 == root.val){
              decreasing = Math.max(decreasing, rightside +1);
           }
           ans = Math.max(ans, decreasing + lastNode -1);
           return decreasing + lastNode -1;
    }
}
