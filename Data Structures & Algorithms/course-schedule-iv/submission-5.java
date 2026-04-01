class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
        List<List<Integer>> graph = new ArrayList<>();
        int [] indegree = new int[numCourses];
        List<Boolean> result = new ArrayList<>();  
        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<>());
        if(prerequisites.length ==0){
            for(int i=0; i<numCourses; i++) result.add(false);
            return result;
        }
        
        
        for(int [] temp : prerequisites){
            int u = temp[0];
            int v = temp[1];
            graph.get(u).add(v);
        }
//List<Boolean> result = new ArrayList<>();
        for(int []arr : queries){
            int first = arr[0];
            int second = arr[1];
            result.add(dfs(graph, first, second, new HashSet<>()));
        }
      
        return result;

    }


    public boolean dfs(List<List<Integer>> graph, int a, int b, Set<Integer> seen){
       System.out.println(a + " first");
        System.out.println(b + " first");
        if(a == b) {return true;}
        if(seen.contains(a)){
           return false;
        }
        seen.add(a);
        for(int temp : graph.get(a)){
            
             
            boolean check= dfs(graph, temp, b, seen);
            if(check == true){return true;}
        }
        return false;
    }
}