class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        
        result = new ArrayList<>();
        dfs(new ArrayList<>(), n, k, 1);
        return result;

    }

    public void dfs(List<Integer> temp, int n, int k, int index){
     
      if(temp.size() == k){
         result.add(new ArrayList<>(temp));
      }
      //if(temp.size() > k){return; }

      for(int i = index; i<=n; i++){
        temp.add(i);
        dfs(temp, n, k, i+1);
        temp.remove(temp.size()-1);
      }
    }
}