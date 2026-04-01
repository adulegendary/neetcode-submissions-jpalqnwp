class Solution {
    int current =0;
    public int maxAreaOfIsland(int[][] grid) {


        int row =grid.length;
        int col = grid[0].length;
        boolean [][] visited = new boolean[row][col];
       int total =0;
       
       for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if(grid[i][j] == 1){
                dfs(grid, visited, i, j);
                total = Math.max(total, current);
                current =0;
            }
        }
       }

       return total;
    }


  public void dfs(int [][]grid, boolean [][]visited, int row, int col){
    
         int ROW = grid.length;
         int COL = grid[0].length;

         if(row >=ROW || col >=COL || row<0 || col<0){
            return ;
         }
         if(visited[row][col] == true){
            return;
         }
         if(grid[row][col] == 0){
            return;
         }

         visited[row][col] = true;
         current +=1;
         dfs(grid, visited, row +1, col);
         dfs(grid, visited, row-1, col);
         dfs(grid, visited, row, col-1);
         dfs(grid, visited, row, col+1);

         return ;

  }
}
