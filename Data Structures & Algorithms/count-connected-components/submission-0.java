class Solution {
    public int countComponents(int n, int[][] edges) {
       if(n<=2){
        return 1;
       }
       
       List<List<Integer>> graph = new ArrayList<>();
       for(int i=0; i<n; i++){
          graph.add(new ArrayList<>());
       }
       for(int [] single : edges){
          int a = single[0];
          int b = single[1];
          graph.get(a).add(b);
          graph.get(b).add(a);

       }

       boolean []visted = new boolean[n];
       int total = 0;
       for(int i=0; i<n; i++){
          total +=dfs(graph, visted, i);
       }

       return total;
    }

    public int dfs(List<List<Integer>> graph, boolean [] visted, int node){
          if(visted[node]){
             return 0;
          }
          visted[node] = true;
          for(int vales : graph.get(node)){
              if(!visted[vales]){
                dfs(graph, visted, vales);
              }
          }


          return 1;

    }


}
