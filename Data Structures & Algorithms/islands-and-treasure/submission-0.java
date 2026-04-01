class Solution {

    public void islandsAndTreasure(int[][] grid) {

       int ROW = grid.length;
       int COL = grid[0].length;
      
       for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == Integer.MAX_VALUE){
                      int vales =bfs(grid, i, j);
                      System.out.println(vales + "up here");
                      if(vales >0){
                         grid[i][j] = vales;
                      }
                }
            }
        }
        
    }


    public int bfs(int[][]grid, int row, int col){

      int ROW = grid.length;
      int COL = grid[0].length;
      boolean [][] visited = new boolean[ROW][COL];
      int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
      Queue<int[]> q = new LinkedList<>();
      
      q.add(new int[]{row, col});;
      visited[row][col] = true;
      int steps =0;
      int inf = Integer.MAX_VALUE;
      while(!q.isEmpty()){
         int size = q.size();
          steps +=1;
         for(int i=0; i<size; i++){
            int [] current = q.poll();
      
            for(int [] dir : direction){
                int dirRow = current[0] + dir[0];
                int dirCol = current[1] + dir[1];
                if(dirRow >=0 && dirCol >=0 && dirCol < COL && dirRow < ROW){
               // System.out.println("yes " + dirRow + " " + dirCol);
                  if(grid[dirRow][dirCol] == 0){
                     return steps;
                  }
                 if(grid[dirRow][dirCol] != -1 && grid[dirRow][dirCol] != 0 && visited[dirRow][dirCol] == false){
                      q.add(new int[]{dirRow, dirCol});
                      System.out.println("yes " + dirRow + " " + dirCol);
                      visited[dirRow][dirCol] = true;
                 }

            }
         }
      }
     
   
    }

    return 0;


    }
}
