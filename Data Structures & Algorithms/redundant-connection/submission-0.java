class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        
        int [] par = new int[edges.length+1];
         int [] ran = new int[edges.length+1];
                
        for(int i=0; i<edges.length+1; i++) {
            par[i] =i;
            ran[i] = 1;
        }
       
        for(int []pre :edges){
            int first = pre[1];
            int second = pre[0];
            if(!union(par, ran, first, second)){
                return new int[]{second, first};
            }
           
        }

        return new int[]{};




    }

    public int find(int [] par, int node){
        int vertex = par[node];
        while(vertex != par[vertex]){
            par[vertex] = par[par[vertex]];
            vertex = par[vertex];
        }

        return vertex;
    }

    public boolean union(int [] par, int [] ran, int node1, int node2){
        
        int p1 = find(par, node1);
        int p2 = find(par, node2);
        
        if(p1 == p2) {return false;};

        if(ran[p1] > ran[p2]){
            ran[p1] += ran[p2];
            par[p2] = p1;
        }else{
            ran[p2] += ran[p1];
            par[p1] = p2;
        }

        return true;
        
    }
}