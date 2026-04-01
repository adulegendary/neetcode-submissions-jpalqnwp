class Solution {
    boolean [][]check;
    public int numIslands(char[][] grid) {
        int row =grid.length;
        int col = grid[0].length;
        int counter =0;
        check = new boolean[row][col];
        for(int i=0; i< row; i ++){
            for(int j=0; j<col; j++){
                 if(grid[i][j] == '1' && !check[i][j]){
                    dfs(grid, i, j);
                    counter +=1;
                 }
                
            }
        }
        return counter;
        
    }
    public void  dfs(char [][]grid, int row, int col){
          if(row < 0 || row >= grid.length){
             return ;  
          }
          if(col < 0 || col >= grid[0].length ){
             return ;
          }if(grid[row][col] == '0'){
            return;
             
          }if(check[row][col] == true){
            return ;
          }
             //if(check[row][col] == false){
              check[row][col] = true;
              dfs(grid,row-1, col);
              dfs(grid,row+1, col);
              dfs(grid,row, col+1);
              dfs(grid,row, col-1);
           //}


           
          }

    

}
