class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        // int total = 0;
        // for(int i : candidates){
        //      total +=i;
        // }
        int current =0;
        dfs(candidates, new ArrayList<>(), result, target, current, 0);
        return result;
        
    }
    public void  dfs(int[] candidates, List<Integer> res,List<List<Integer>> result, int target, int current, int index ){
         
         if(current > target){
            return ;
         }
         if(current == target){
            result.add(new ArrayList(res));
            return ;
         }

         if(index == candidates.length){
            //res.remove(index-1);
             return ;
         }
         
        current += candidates[index];
        res.add(candidates[index]);
        dfs(candidates, res, result, target, current, index );

       
        res.remove(res.size()-1);

        current -= candidates[index];
        dfs(candidates, res, result, target, current, index + 1);    
        
       
       

        return ; 





    }
}