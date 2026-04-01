class Solution {
    int global =1;
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int counter =0;
        int [][]memo = new int[row][col];
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                 memo[i][j] = -1;
            }
         }
        int result = Integer.MIN_VALUE;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                  int values = dfs(matrix, memo, i, j, 1, -1);
                  result = Math.max(result, values);
                  global =0;
        
                }
               
        }

        return result;
        
    }


    public int dfs(int[][] matrix,  int [][]memo, int row, int col, int counter, int current){
        int ROW = matrix.length;
        int COL = matrix[0].length;

        if(row <0 || row >= ROW || col <0 || col >=COL){
            return 0;
        }
 
        if(current >= matrix[row][col]){
            return 0;
        }

        if(memo[row][col] != -1){return memo[row][col];}


     
        current = matrix[row][col]; 
       
        int up =dfs(matrix, memo, row +1, col,  counter, matrix[row][col]);
        int down =dfs(matrix, memo, row -1, col,  counter, matrix[row][col]);
        int right =dfs(matrix, memo, row, col+1, counter, matrix[row][col]);
        int left =dfs(matrix, memo, row, col-1, counter, matrix[row][col]);
           
      

        int bestFromHere = 1 + Math.max(Math.max(down, up), Math.max(right, left));

        memo[row][col] = bestFromHere;
        return bestFromHere;

    }
}