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
    public int rob(TreeNode root) {
        
        if(root == null) return 0;
        int [] result = dfs(root);
        return Math.max(result[0], result[1]);
    }

    public int [] dfs(TreeNode root){
        if(root == null){
             return new int[]{0,0};
        }
       // temp[0] = with root
       // temp[1] = without root

        int [] leftChild = dfs(root.left);
        int [] rightChild = dfs(root.right);

       if(root != null){
          int with = root.val + leftChild[1] + rightChild[1];
          int withOutroot = Math.max(leftChild[0], leftChild[1]) + Math.max(rightChild[0], rightChild[1]);
          return new int[]{with, withOutroot};

       }

       return new int[]{0,0};

        
    }
}