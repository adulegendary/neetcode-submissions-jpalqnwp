class Solution {
    boolean [][] visted;
    public int countServers(int[][] grid) {
        int total =0;
        visted = new boolean[grid.length][grid.length];
        int []row = new int[grid.length];
        int [] col = new int [grid[0].length];
        
        for(int i=0; i<grid.length; i++){
           for(int j=0; j<grid[0].length; j++){
              if(grid[i][j] == 1 ){
                  row[i] +=1;
              }
            }
        }

        for(int i=0; i<grid[0].length; i++){
           for(int j=0; j<grid.length; j++){
              if(grid[j][i] == 1 ){
                  col[i] +=1;
              }
            }
        }

         for(int i=0; i<grid.length; i++){
           for(int j=0; j<grid[0].length; j++){
              if(grid[i][j] == 1 ){
                 if(row[i] > 1 || col[j]>1){
                    
                   total +=1;
                }
              }
            }
        }





       

       

        

      
        return total;
    }
    // public int dfs(int[][] grid, int row, int col, int counter){
    //     int ROW = grid.length;
    //     int COL = grid[0].length;
    //     if(row >= ROW || col >= COL || col<0 || row<0){
    //         return 0;
    //     }

    //     if(grid[row][col] == 1){
    //          counter +=1;
    //     }

    //     if(visted[row][col] == true){
    //          return 0;
    //     }

    //     visted[row][col] = true;
    //     int values =0;

    //     int up = dfs(grid, row+1, col, counter) ;
    //     int down = dfs(grid, row -1, col, counter);
    //     int right= dfs(grid, row, col+1, counter,);
    //     int left = dfs(grid, row, col-1, counter);
       

    //     return values;

    // }
}