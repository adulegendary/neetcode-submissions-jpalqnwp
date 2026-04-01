class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> result = new ArrayList<>();
       StringBuilder vale = new StringBuilder();
       dfs(0, 0, n, vale, result);
       return result;        
    }

    public void dfs(int open, int close, int n, StringBuilder va, List<String> res){

      if(open==close && open == n){
          res.add(va.toString());
          return ;
      }
      if(open<n){
        va.append("(");
        dfs( open +1,  close, n, va, res);
        va.deleteCharAt(va.length()-1);
      }
        if(close<open){
        va.append(")");
        dfs(open, close+1, n, va, res);
        va.deleteCharAt(va.length()-1);
      }

    }
}
