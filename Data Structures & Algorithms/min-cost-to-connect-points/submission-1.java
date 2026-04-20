class Solution {
    public int minCostConnectPoints(int[][] points) {
        
    
     
      int row = points.length;
      int col = points[0].length;
      Set<String>  visted = new HashSet<>();

     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
 
     
     pq.add(new int[]{0, points[0][0], points[0][1]});
     int totalCost =0;

     while(!pq.isEmpty()){
        
        int [] temp = pq.poll();

        int cost = temp[0];
        int firstIndex = temp[1];
        int secondIndex = temp[2];

        StringBuilder seen = new StringBuilder();
        seen.append(firstIndex).append(" + ").append(secondIndex);

        if(visted.contains(seen.toString())){
              continue;
        }
      //  System.out.println(cost + " " +firstIndex + " " + secondIndex);
        
        totalCost += cost;
       
        visted.add(seen.toString());

        for(int [] val : points){
            int [] current = {firstIndex, secondIndex};
            

            if(current == val){
                 continue;
            }

            StringBuilder edgesSeen = new StringBuilder();
            edgesSeen.append(val[0]).append(" + ").append(val[1]);

            int manHaten = Math.abs(firstIndex - val[0]) + Math.abs(secondIndex - val[1]);

            if(!visted.contains(edgesSeen.toString())){
                 pq.add(new int[] {manHaten, val[0], val[1]});
            }
        }
     }
   
       return totalCost;
    }
}
