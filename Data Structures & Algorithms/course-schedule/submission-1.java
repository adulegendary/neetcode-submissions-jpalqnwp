class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        if(n==1){
            return true;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i< numCourses; i++){
            graph.add(new ArrayList());
        }

        for(int [] pa : prerequisites){
            int a = pa[0];
            int b = pa[1];
            graph.get(b).add(a);
        }

        boolean []visted = new boolean[numCourses];
        boolean []path = new boolean[numCourses];
        for(int i=0; i<numCourses; i++){
            if(!dfs(graph, visted,path, i )){
                  return false;
            }
              
              
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> graph, boolean []visited, boolean []path, int course ){
          
          if(path[course]){
              return false;
          }
        //   if(visited[course]){
        //       return false;
        //   }

          path[course] = true;
        
          for(int vales : graph.get(course)){
                if(!dfs(graph, visited,path,vales)){
                        return false;
                }
            }

            visited[course] = true;
            path[course] = false;
            

          return true;
          
    }
}
