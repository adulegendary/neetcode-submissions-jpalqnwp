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
    List<List<Integer>> result;
    public List<List<Integer>> findLeaves(TreeNode root) {
         result = new ArrayList<>();
         while(root != null){
           List<Integer> temp = new ArrayList<>();
           root = findLeaves(root, temp);
           result.add(temp);
         }

         return result;
    }

    public TreeNode findLeaves(TreeNode root, List<Integer> temp){
        if(root == null) return null;
        
        if(root.left == null && root.right == null){
            temp.add(root.val);
            return null;
        }
       root.left =  findLeaves(root.left, temp);
       root.right = findLeaves(root.right, temp);
       return root;
    }
}
