class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);
       dfs(result, new ArrayList<>(), nums, 0);
       
      // System.out.println(result);
       return result;
    }


     public void dfs(List<List<Integer>> result, List<Integer> temp, int[] candidates, int index){
        
    
        result.add(new ArrayList(temp));
        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
           
            temp.add(candidates[i]);
            
            dfs(result, temp, candidates, i+1);

            
            temp.remove(temp.size()-1);
        }
     }

       
}
