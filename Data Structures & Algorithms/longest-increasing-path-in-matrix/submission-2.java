class Solution {
    int global =1;
    public int longestIncreasingPath(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int counter =0;
        boolean [][]visted = new boolean[row][col];
        int result = Integer.MIN_VALUE;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
              //  if(matrix[i][j] == 1){
                  dfs(matrix, i, j, visted, 0, -1);
                //System.out.println(global);
                  result = Math.max(result, global);
                  global =0;
            //}
                }
               
        }

        return result;
        
    }


    public void dfs(int[][] matrix,  int row, int col, boolean [][]visted, int counter, int current){
        int ROW = matrix.length;
        int COL = matrix[0].length;

        if(row <0 || row >= ROW || col <0 || col >=COL){
            return;
        }
        if(visted[row][col] == true){
            return ;
        }
        if(current >= matrix[row][col]){
            return ;
        }


        visted[row][col] = true;
        counter +=1;
        global = Math.max(global, counter);
        System.out.println(counter);
        current = matrix[row][col];
       
        dfs(matrix, row +1, col, visted, counter, matrix[row][col]);
        dfs(matrix, row -1, col, visted, counter, matrix[row][col]);
        dfs(matrix, row, col+1, visted, counter, matrix[row][col]);
        dfs(matrix, row, col-1, visted, counter, matrix[row][col]);

        visted[row][col] = false;

        return;

    }
}
