class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
       // dfs(result,candidates,new ArrayList<>(), target, 0 , 0);
        dfs(result, candidates, new ArrayList<>(), target, 0, 0);
         
        return result;
    }

    public void dfs(List<List<Integer>> result,int [] num, List<Integer> temp, int target, int counter, int index){
      
      if(target == counter){
            result.add(new ArrayList(temp));
      }
      if(counter > target){
        return ;
      }

      for(int i=index; i<num.length; i++){
         if(i > index && num[i] == num[i-1]){
            continue;
         }

         temp.add(num[i]);
         counter += num[i];

         dfs(result, num, temp,target, counter, i+1);
         
         temp.remove(temp.size()-1);
         counter -= num[i];

      }


    }
}
