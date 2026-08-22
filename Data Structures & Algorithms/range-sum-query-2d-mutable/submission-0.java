class NumMatrix {




   /*
   [3, 0, 1, 4, 2], 
   [5, 6, 3, 2, 1], 
   [1, 2, 0, 1, 5],  2
   [4, 1, 0, 1, 7], 
   [1, 0, 3, 0, 5]]], 

   
   */
    int [][] grid ;
    int ROW;
    int COL;
    public NumMatrix(int[][] matrix) {
          ROW = matrix.length;
          COL = matrix[0].length;
          grid = new int[ROW][COL];
          for(int i=0; i<ROW; i++){
            for(int j=0; j<COL; j++){
                grid[i][j] = matrix[i][j];
            }
          }
    }
    
    public void update(int row, int col, int val) {
         grid[row][col] = val;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int totalSum = 0;
        if(col1 < 0 || col2 < 0 || col2 > COL || col1 > COL){
             return 0;
        }
        if(row1 < 0 || row2 < 0 || row1 > ROW || row2 > ROW){
             return 0;
        }
        int startingRow = Math.min(row1, row2);
        int endingRow  = Math.max(row1, row2);
        int startingCol = Math.min(col1, col2);
        int endingCol  = Math.max(col1, col2);
        for(int i = startingRow; i<=endingRow; i++){
            for(int j= startingCol; j<=endingCol; j++){
                  totalSum += grid[i][j];
            }
        }


        return totalSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
