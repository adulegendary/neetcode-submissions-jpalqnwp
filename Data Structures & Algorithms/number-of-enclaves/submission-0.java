class Solution {
    boolean [][] visted;
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visted = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            if(grid[i][0] == 1){
                 // do the dfs;
                   dfs(grid, i, 0);
            }
            if(grid[i][n-1] == 1){
                 // do the dfs;
                   dfs(grid, i, n-1);
            }
        }
          for(int i=0; i<n; i++){
            if(grid[0][i] == 1){
                dfs(grid, 0, i);
            }
            if(grid[m-1][i] == 1){
                 // do the dfs;
                   dfs(grid, m-1, i);
            }
        }
        int counter =0;
        for(int i=1; i< m; i++){
            for(int j=1; j<n; j++){
                if(grid[i][j] == 1 && !visted[i][j]){
                    counter +=1;
                }
            }
        }

        return counter;
         

        
    }

    public void dfs(int[][] grid, int row, int col){
        int ROW = grid.length;
        int COL = grid[0].length;
        if(row >= ROW || col >= COL || row < 0 || col < 0 ){
            return ;
        }

        if(grid[row][col] == 0 || visted[row][col]){
             return;
        }
        visted[row][col] = true;
         dfs(grid, row+1, col);
         dfs(grid, row-1, col);
         dfs(grid, row, col+1);
         dfs(grid, row, col-1);

         return;
        
    }
}