class Solution {
    public void setZeroes(int[][] matrix) {
 

        int row = matrix.length;
        int col = matrix[0].length;
        boolean [][] visted = new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    System.out.println("get here");
                    change(matrix, i, j, visted);
                }
            }
        }
  System.out.println(Arrays.toString(visted[0]));
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(visted[i][j]){
                     System.out.println("hmm b here");
                     matrix[i][j] = 0;
                }
            }
        }
        
    }

    public void change(int [][] matrix, int row, int col,  boolean [][] visted  ){
        int ROW = matrix.length;
        int COL = matrix[0].length;
        for(int i=0; i<COL; i++){
           
           visted[row][i] = true;
        }
 System.out.println(col + " im here ");
        for(int i=0; i<ROW; i++){
             System.out.println(i + "whats going here inside");
             visted[i][col] = true;
          
        }
    }
}
