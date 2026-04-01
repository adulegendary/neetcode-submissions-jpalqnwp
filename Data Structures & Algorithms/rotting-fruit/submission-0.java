


class Solution {
    public int orangesRotting(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int fresh =0;
        Queue<int[]> roten = new LinkedList<>();
        for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               if(grid[i][j] == 1){
                   fresh +=1;
               }
                if(grid[i][j] == 2){
                  roten.add(new int[]{i, j});
               }
           }
        }
        if(roten.isEmpty() && fresh >0){return -1;}
        if(roten.isEmpty() && fresh ==0){return 0;}

        return bfs(grid,roten,fresh) ;    
          
    }
 

    public int bfs(int [][] grid , Queue<int[]> q,  int fresh){
        int ROW = grid.length;
        int COL = grid[0].length;
        int steps =0;
         
        int [][]direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean [][]visted = new boolean[ROW][COL];
       
        int index =1;
        while(!q.isEmpty()){
           int size = q.size();
           steps +=1; 
           for(int i=0; i<size; i++){
             int []current = q.poll();
              visted[current[0]][current[1]] = true;
             for(int []dir : direction){
                int dirRow = current[0] + dir[0];
                int dirCol = current[1] + dir[1];
                if(dirRow>=0 && dirCol >=0 && dirCol < COL && dirRow <ROW){       
                    if(!visted[dirRow][dirCol] && grid[dirRow][dirCol] == 1){
                       // System.out.println(dirRow +  " " + " " + dirCol);
                        visted[dirRow][dirCol] = true;
                        q.add(new int[]{dirRow, dirCol});
                        fresh -=1;
                    }
                }
             }
           }
          
        }


        if(fresh ==0){
            return steps-1;
        }
        return -1;
    }
}

