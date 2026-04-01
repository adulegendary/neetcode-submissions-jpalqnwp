class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n - 1) {
            return false;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i< n; i++){
            graph.add(new ArrayList<>());
        }

        for(int []ed: edges){
            int a = ed[0];
            int b= ed[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean [] visted = new boolean[n];
        int totalEdges = dfs(graph, visted, 0);
        for(int i=0; i<n; i++){
            if(!visted[i]){return false;}
          
        }
        System.out.println(totalEdges);

        
        
    return totalEdges == n-1;


    }

    public int dfs(List<List<Integer>> graph, boolean [] visted, int node){
      
          if(visted[node] == true){
            return 0;
          }
          visted[node] = true;
          int total =0;
          for(int val : graph.get(node)){
                if(!visted[val]){
                  //  total +=1;
                    total += dfs(graph, visted, val)+1;
                }
                 

          }
          return total;

       
    }
}
