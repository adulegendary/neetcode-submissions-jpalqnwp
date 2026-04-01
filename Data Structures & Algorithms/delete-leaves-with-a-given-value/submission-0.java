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
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if(root == null) return null;

       return  dfs(root, target);
        
    }

    public TreeNode dfs(TreeNode root, int target) {
         if(root == null) {
           // System.out.println("why its not getting here");
            return null;
         }

         System.out.println(root.val);

          root.left =  dfs(root.left, target);
        root.right = dfs(root.right, target);

         if(root.val == target && root.left ==null && root.right == null){
            
             return null;
         }
        

         return root;
    }


}