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
   int ans = -100000;
    public int longestConsecutive(TreeNode root) {
        
        if(root == null) return 0;
        
        dfs(root, root.val, 1);
        return ans;
    }

    public int dfs(TreeNode root, int prev, int counter){
        if(root == null) return counter;
        
        
        if(root.val == prev+1){
            counter +=1;
        }
        else{
            
            counter =1;
        }
        ans = Math.max(ans, counter);
        int left = dfs(root.left, root.val, counter);
        int right = dfs(root.right, root.val, counter);

        return Math.max(left, right);


    }
}
