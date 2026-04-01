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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){return result;}

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
      

        while(!q.isEmpty()){
           
           
            List<Integer> vales = new ArrayList<>();
            int sizeOfque = q.size();
            for(int i=0; i< sizeOfque; i++){

                TreeNode removedele = q.remove();
                vales.add(removedele.val);
                if(removedele.left != null){
                     q.add(removedele.left);
                }if(removedele.right != null){
                     q.add(removedele.right);
                } 
           
            }
            
           
            if(vales.size()>=1){
               result.add(vales);
          }
           
          
           
        }

        return result;
    }
}
