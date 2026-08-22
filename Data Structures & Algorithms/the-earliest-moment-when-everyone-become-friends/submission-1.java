class Solution {
    int [] parent;
    int [] rank;
    public int earliestAcq(int[][] logs, int n) {

        Arrays.sort(logs, (a, b) -> Integer.compare(a[0], b[0]));
        parent = new int[n];
        rank =  new int[n];
         for(int i=0; i<parent.length; i++){
              parent[i] =i ;
         }
     

         for(int [] temp : logs){
            int time = temp[0];
            int x = temp[1];
            int y = temp[2];
            union(x, y);
            int root = 0;
            for(int i=0; i< n; i++){
                if(parent[i] == i){
                     root ++;
                }
            }
            if(root ==1) return time;
         }

         return -1;
        /*
           []
           0 ->1 ->5
           |
           3- > 2 - > 4

           O(logs * n);
           parent
            0 1 2 3 4 5 
           [3,0,3 3 3 0]
           check the timestamp = 
                if they are friend alreay or not (x, y)
                if it already friends 
                              
                iterat over the parent and see if there is only one parent
                   if its one parent return the timestamp
                
        
        */
         
    }
    public int find(int x){
        if(parent[x] != x){
             parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean union(int x, int y){
        int friend1 = find(x);
        int friend2 = find(y);
        
        if (friend1 == friend2) return false;

        if(rank[friend1] > rank[friend2]){
             parent[friend2]= friend1;
        }else if(rank[friend1] < rank[friend2]){
            parent[friend1]= friend2;
        }else{
             parent[friend2]= friend1;
             rank[friend1] +=1;
        }

        return true;
    }
}
