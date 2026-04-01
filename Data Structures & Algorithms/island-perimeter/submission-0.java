class Solution {
    public int islandPerimeter(int[][] grid) {
        // 0 is water
        // 1 is land

       int perimeter =0;
       
       for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
              if(grid[i][j] == 1){
                 perimeter +=direction(grid, i, j);
              }
        }
       }
       return perimeter;
    }

    public int direction(int[][] grid, int row, int col){
        int ROW =grid.length;
        int COL = grid[0].length; 
        int counter =0;
        int [][] directon = {{1,0}, {-1,0} , {0, 1}, {0, -1}};

        for(int [] dir : directon){
            int curRow = dir[0] + row;
            int curCol = dir[1] + col;
            if(curRow >= ROW || curRow < 0 || curCol < 0 || curCol >= COL){
               counter +=1;
            }
            else if(grid[curRow][curCol] == 0){
                counter +=1;
            }
        }

        return counter;

    }

}