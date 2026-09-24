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
class Order{
     
     int column;
     TreeNode q;
     Order(TreeNode q, int column){
        this.q = q;
        this.column = column;
     }

     void setQueue(TreeNode root){
          this.q = root;
     }
     void setcolumn(int column){
          this.column = column;
     }

     TreeNode getQueu(){
         return this.q;
     }
     
     int getColumn(){
        return this.column;
     }

    
}
class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Order> queue = new ArrayDeque<>();
        queue.add(new Order(root, 0) );
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        while(!queue.isEmpty()){
          int size = queue.size();
          for(int i=0; i<size; i++){
             Order temp =  queue.poll();
             int columnVal =  temp.getColumn();
             TreeNode node = temp.getQueu();
             map.computeIfAbsent(columnVal, k -> new ArrayList<>()).add(node.val);
             if(node.left != null){
               queue.add(new Order(node.left, columnVal-1));
             }
             if(node.right != null){
                queue.add(new Order(node.right, columnVal+1));
             }
             
          }
        }
        
        for(List<Integer> temp : map.values()){
            result.add(temp);
        }
        
              
          return result;
    }
}