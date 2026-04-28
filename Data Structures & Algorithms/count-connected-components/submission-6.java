class Solution {
    int [] parent;
    int [] rank;
    public int countComponents(int n, int[][] edges) {
         
         parent = new int[n];
         rank  = new int[n];
         for(int i=0; i<n; i++){
            parent[i] = i;
         }
         System.out.println(Arrays.toString(parent)); 
         int connected = 0; 
         for(int [] temp : edges){
            int u = temp[0];
            int v = temp[1];
            union(u, v);
         }

  
         for(int i=0 ; i< parent.length; i++){
             
              if(parent[i] == i) connected ++;
         }

         return connected;

    }


    public int find(int x){
      if(x != parent[x]){
           x = find(parent[x]);
      }

      return x;
    }

    public boolean union(int u, int v){
      int first = find(u);
      int second = find(v);

      if(first == second) return false;

      if(rank[first] > rank[second]){
         parent[second] = first;
         
      }else if(rank[first] < rank[second]){
         parent[first] = second;
      
      }else {
         parent[second] = first;
         rank[first] +=1;
      }


      return true;
    }
}
