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
    public List<Integer> rightSideView(TreeNode root) {
          if (root == null){
            return new ArrayList();
          }
          List<Integer> result = new ArrayList<>();
          ArrayDeque<TreeNode> q = new ArrayDeque<>();
          q.add(root);
          result.add(root.val);
          
          while(!q.isEmpty()){

            int size = q.size();

             for(int i=0; i<size; i++){
                TreeNode val =  q.poll();
                 if(val.left != null){
                  q.add(val.left);
                 }if(val.right != null){
                  q.add(val.right);
                }
             }

             TreeNode last = q.peekLast();
             if(last != null){
               result.add(last.val);
             }
             //System.out.println(last.val);
             
             // System.out.println(result + " im reuslt");

          }
           System.out.println(result + " im reuslt");

          return result;
          
    }
}
