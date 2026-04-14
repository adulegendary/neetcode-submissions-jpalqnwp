class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int [] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        distance[k] = 0;
        
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<n+1; i++) graph.add(new ArrayList<>());
        
        for(int i=0; i<times.length; i++){
            int source = times[i][0];
            int target = times[i][1];
            int time = times[i][2];
            graph.get(source).add(new int[]{target,time});
        }
        
        // in our pq we have to have the distance and and node
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, k});
        int result =0;
        boolean [] visted = new boolean[n+1];
        visted[k] = true;
       // System.out.println(Arrays.toString(visted) +  "first");
        while(!pq.isEmpty()){
             int [] temp =  pq.poll();
             int dist = temp[0];
             int node = temp[1];
            
             visted[node] = true;
             int size = graph.get(node).size();
             for(int [] edges : graph.get(node)){
                 int target = edges[0];
                 int travelTime = edges[1];
                
                // System.out.println(Arrays.toString(visted) +  "  inside");
                 if(distance[node] + travelTime < distance[target]){
                    
                    distance[target] =distance[node] + travelTime;
                    pq.add(new int[]{distance[node] + travelTime, target});
                   
                     //System.out.println( distance[target] +  "  distance");
                 }
             }
            
            

        }
      //  System.out.println(Arrays.toString(distance));
        for(int i=1; i<distance.length; i++){
            if(distance[i] == Integer.MAX_VALUE){return -1;}
            result = Math.max(result, distance[i]);
        }  

        return result;
    }
}
