class Solution {
    public void solve(char[][] graph) {

        int row = graph.length;
        int col = graph[0].length;
        boolean [][]visted = new boolean[row][col];
        for(int i=0; i<row; i++){
            if(graph[i][0] == 'O'){
                 System.out.println("it yes here");
                dfs(graph, visted, i, 0);
            }
             if(graph[i][col-1] == 'O'){
                 System.out.println("it column here");
                dfs(graph, visted, i, col-1);
            }
            
        }
        int index=0;

     
        for(int i=0; i<col; i++){
            if(graph[0][i] == 'O'){
                dfs(graph, visted, 0, i);
            }
             if(graph[row-1][i] == 'O'){
                dfs(graph, visted, row-1, i);
            }
        }



  
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(!visted[i][j] && graph[i][j] == 'O'){
                   
                    graph[i][j] = 'X';
                }
            }
        }
        
      
    }

    public void   dfs(char[][]graph, boolean [][]visted, int row, int col){
        int ROW = graph.length;
        int COL = graph[0].length;
        
        if(row <0 || row >=ROW || col<0|| col>=COL){
            return ;
        }
       
        if(graph[row][col] == 'X'){
            return ;
        }
         
        if(visted[row][col]){return;}
        
        visted[row][col] = true;
        //graph[row][col] = '#';
       System.out.println(row);
        dfs(graph, visted, row+1, col);
        dfs(graph, visted, row-1, col);
        dfs(graph, visted, row, col+1);
        dfs(graph, visted, row, col-1);

       // graph[row][col] = 'O';
    }
        
}
