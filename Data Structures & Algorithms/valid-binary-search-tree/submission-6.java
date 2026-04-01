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
    public boolean isValidBST(TreeNode root) {
       if (root == null) {
          return true;
       }

       return dfs(root, Integer.MIN_VALUE,Integer.MAX_VALUE);

}

public boolean dfs(TreeNode root, int low, int high){
    if(root == null){
        return true;
    }
    if(low != Integer.MIN_VALUE &&  low >= root.val){
        return false;
    }if(high != Integer.MAX_VALUE && high <= root.val){
        return false;
    }

    return dfs(root.left, low, root.val) && dfs(root.right, root.val, high);

}
}
