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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        
        return dfs(root1, root2, target);
    }

    public boolean dfs(TreeNode root1, TreeNode root2, int target){
            if(root1 == null) return false;
            if(root2 == null) return false;

            int temp = target - root1.val;
            if(temp == root2.val){
                 return true;
            }
            if(temp > root2.val){
                 if(bst(root2.right, temp)){return true;};
            }else{
                 if(bst(root2.left, temp)){return true;};
            }
            boolean leftroot1 =  dfs(root1.left,  root2, target);
            boolean rightroot1 =  dfs(root1.right,  root2, target);

            return leftroot1 || rightroot1;
    }

    public boolean bst(TreeNode root, int target){
          while(root!= null){
             if(target == root.val){
                return true;
             }else if(target > root.val){
                root = root.right;
             }else{
                root = root.left;
             }
          }

          return false;
    }
}
