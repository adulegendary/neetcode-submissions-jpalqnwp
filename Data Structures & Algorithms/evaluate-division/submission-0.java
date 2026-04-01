class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
       Map<String, Map<String, Double>> graph = new HashMap<>();
       int index =0;
       for(List<String> temp : equations){
            String first = temp.get(0);
            String second = temp.get(1);
            graph.putIfAbsent(first, new HashMap<>());
            graph.putIfAbsent(second, new HashMap<>());
            graph.get(first).put(second, values[index]);
            graph.get(second).put(first, 1.0/values[index]);
            index +=1;
       } 

       double [] result = new double[queries.size()];
       index =0;
       for(List<String> temp : queries){
          String a = temp.get(0);
          String b = temp.get(1);
          result[index++] = dfs(a, b, new HashSet<>(), graph, 1.0);

       }
       System.out.println(graph);
       return result;  
    
    }



    public double dfs(String a,  String b, Set<String> seen, Map<String, Map<String, Double>> graph, double counter){
        if(!graph.containsKey(a)){return -1;}
        if(a.equals(b)) {return counter ;}
        seen.add(a);
        for(Map.Entry<String, Double> e : graph.get(a).entrySet()){
            String first = e.getKey();
            Double second = e.getValue();
            if(seen.contains(first)){continue;}
           
            double vale = dfs(first, b, seen, graph, counter * second);
            if(vale != -1){return vale;}
        }
        return -1;
    }
}