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
    int smallest;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
      smallest =0;
      ans = 0;
      dfs(root, k);
      return ans;  
    }
    public void  dfs(TreeNode root, int k){   
        if(root == null){
            return;
        }

        dfs(root.left, k);
        smallest +=1;
        if(smallest==k && root != null){
            ans = root.val;
        }
        dfs(root.right, k);

        return ;   
    }  
}
