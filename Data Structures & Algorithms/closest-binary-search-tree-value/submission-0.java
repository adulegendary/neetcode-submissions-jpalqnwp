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
    int result;
    double difference;
    public int closestValue(TreeNode root, double target) {
        result = 0;
        difference = Double.MAX_VALUE;
        dfs(root, target);
        return result;
    }

    public void dfs(TreeNode root, double target){
        if(root == null) return ;

        double val = Math.abs((double)root.val - target);
        if(difference > val){
           difference = val;
           result = root.val;
        }

        if((double) root.val > target){
            dfs(root.left, target);
        }else{
            dfs(root.right, target);
        }


        return;



    }
}
