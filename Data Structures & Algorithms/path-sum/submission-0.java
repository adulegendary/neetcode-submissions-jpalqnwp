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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        return dfs(root, targetSum, 0); 
    }

    public boolean dfs(TreeNode root, int target, int counter){
       
        if(root == null){
            return false;
        }
         counter += root.val;

        boolean left = dfs(root.left,  target, counter );
        boolean right = dfs(root.right,  target,  counter);
        System.out.println(counter + "counter this right");
        System.out.println(left + " boolean check this left");
        System.out.println(right + " boolean check this right");

        if(root != null && root.left == null && root.right ==null){
              if(counter == target){
                return true;
              }
             return false;
        }

        return left || right;
        
    }
}