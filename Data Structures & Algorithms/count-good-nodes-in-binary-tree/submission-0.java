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

    int total =0;
    public int goodNodes(TreeNode root) {
         
         if(root ==null){
            return 0;
         }

         dfs(root, root.val);


         return total;
    }

    public void dfs(TreeNode root, int high){
        if(root == null){
            return ;
        }

        if(root.val >= high){
              total +=1;
              high = root.val;
            
        }
        dfs(root.left, high);
        dfs(root.right, high);

    }
}
